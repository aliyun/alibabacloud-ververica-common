package com.ververica.common.model.deployment;

import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;
import com.ververica.common.util.Polymorphic;
import com.ververica.common.util.PolymorphicResolver;
import lombok.Data;

import java.util.List;


@JsonTypeIdResolver(Artifact.Resolver.class)
public interface Artifact extends Polymorphic {

  @Data
  class JarArtifact implements Artifact {
    public static final String KIND = "JAR";

    String kind = KIND;
    String jarUri;
    String mainArgs;
    String entryClass;
    String flinkVersion;
    String flinkImageRegistry;
    String flinkImageRepository;
    String flinkImageTag;
    List<String> additionalDependencies;

    @Override
    public void setKind(String ignored) {
    }
  }

  @Data
  class SqlScriptArtifact implements Artifact {
    public static final String KIND = "SQLSCRIPT";

    String kind = KIND;

    String sqlScript;

    String flinkVersion;

    String flinkImageRegistry;

    String flinkImageRepository;

    String flinkImageTag;

    @Override
    public void setKind(String ignored) {
    }
  }

  @Data
  class UnknownArtifact implements Artifact {
    String kind;

    @Override
    public void setKind(String ignored) {
    }
  }

  final class Resolver extends PolymorphicResolver {
    public Resolver() {
      bind(JarArtifact.KIND, JarArtifact.class);
      bind(SqlScriptArtifact.KIND, SqlScriptArtifact.class);
      bindDefault(UnknownArtifact.class);
    }
  }
}


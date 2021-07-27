package com.ververica.common.model.deployment;

import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;
import com.ververica.common.util.Polymorphic;
import com.ververica.common.util.PolymorphicResolver;
import java.util.List;
import lombok.Data;

@JsonTypeIdResolver(Artifact.Resolver.class)
public interface Artifact extends Polymorphic {

  @Data
  class JarArtifact implements Artifact {
    public static final String KIND = "JAR";

    String kind = KIND;
    Boolean imageUserDefined;
    String versionName;
    String jarUri;
    String mainArgs;
    String entryClass;
    String flinkVersion;
    String flinkImageRegistry;
    String flinkImageRepository;
    String flinkImageTag;
    List<String> additionalDependencies;

    @Override
    public void setKind(String ignored) {}
  }

  @Data
  class SqlScriptArtifact implements Artifact {
    public static final String KIND = "SQLSCRIPT";

    String kind = KIND;
    Boolean imageUserDefined;
    String versionName;
    String sqlScript;
    String flinkVersion;
    String flinkImageRegistry;
    String flinkImageRepository;
    String flinkImageTag;
    List<String> additionalDependencies;

    @Override
    public void setKind(String ignored) {}
  }

  @Data
  class PythonArtifact implements Artifact {
    public static final String KIND = "PYTHON";
    Boolean imageUserDefined;
    String versionName;
    String mainArgs;
    String kind = KIND;
    String entryModule;
    String flinkVersion;
    String flinkImageRegistry;
    String flinkImageRepository;
    String flinkImageTag;
    List<String> additionalDependencies;
    List<String> additionalPythonArchives;
    List<String> additionalPythonLibraries;
    String pythonArtifactUri;

    @Override
    public void setKind(String ignored) {}
  }

  @Data
  class UnknownArtifact implements Artifact {
    String kind;

    @Override
    public void setKind(String ignored) {}
  }

  final class Resolver extends PolymorphicResolver {
    public Resolver() {
      bind(JarArtifact.KIND, JarArtifact.class);
      bind(SqlScriptArtifact.KIND, SqlScriptArtifact.class);
      bind(PythonArtifact.KIND, PythonArtifact.class);
      bindDefault(UnknownArtifact.class);
    }
  }
}

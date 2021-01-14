package com.ververica.common.model.ui;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class GetDynamicIndicators {
  String version;
  Server server;
  String platformKubernetesNamespace;
  Integer refreshMs;
  Integer messageHideMs;
  String dateFormat;
  LinkTemplates linkTemplates;
  LicenseInformation licenseInformation;
  List<String> flinkVersions;
  List<String> flinkImageTags;
  Components components;
  String deployEnvironment;
  ExtraConfig extraConfig;

  @Data
  public static class LinkTemplates {
      Map<String, Object> metricsMap;
      String metrics;
      String sessionClusterFlinkUi;
      String flinkUi;
  }

  @Data
  public static class Server {
      String endpoint;
  }

  @Data
  public static class LicenseInformation {
      String licensedTo;
      boolean isCommunityEdition;
      String expiresOn;
      String cpuQuotaType;
      String cpuQuota;
      boolean isTrial;
      boolean isNotForResale;
  }

  @Data
  public static class Components {
      Artifacts artifacts;
      BlobStorage blobStorage;
      Logging logging;
      Metrics metrics;
      Sql sql;
      List<String> clusters;
      Autopilot autopilot;

      @Data
      public static class Artifacts {
          Boolean enabled;
      }

      @Data
      public static class BlobStorage {
          String baseUri;
      }

      @Data
      public static class Logging {
          Boolean enabled;
      }

      @Data
      public static class Metrics {
          Boolean enabled;
      }

      @Data
      public static class Sql {
          Boolean enabled;
          String requiredFlinkImageVersion;
          String requiredFlinkImageTag;
          Map<String, Object> catalogConfig;
      }

      @Data
      public static class Autopilot {
          Boolean enabled;
          String agentFactory;
      }

  }

  @Data
  public static class ExtraConfig {
      private Buc buc;
      private List<String> allowMemberScopes;
      private MultiCluster multiCluster;
      private Namespace namespace;
      private Admin admin;
      private DeploymentTargetType deploymentTargetType;
      private RoleBindingAlone roleBindingAlone;
      private Token token;
      private DeploymentPage deploymentPage;

      @Data
      public static class DeploymentTargetType {
          String allowedAction;
      }

      @Data
      public static class Buc {
          Boolean enabled;
      }

      @Data
      public static class MultiCluster {
          Boolean enabled;
      }

      @Data
      public static class Namespace {
          Boolean enabled;
      }

      @Data
      public static class Admin {
          Boolean enabled;
      }

      @Data
      public static class RoleBindingAlone {
          Boolean enabled;
      }

      @Data
      public static class Token {
          Boolean enabled;
      }

      @Data
      public static class DeploymentPage {
          Boolean enabled;
      }
  }

}


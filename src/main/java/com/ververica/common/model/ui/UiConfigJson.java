package com.ververica.common.model.ui;

import com.ververica.common.model.license.LicenseInformation;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UiConfigJson {
  String version;
  /** TODO: move server.endpoint to components.appmanager.endpoint */
  Map<String, String> server = new HashMap();

  String platformKubernetesNamespace;
  Integer refreshMs;
  Integer messageHideMs;
  String dateFormat;
  Map<String, Object> linkTemplates;
  LicenseInformation licenseInformation;
  List<String> flinkVersions;
  List<String> flinkImageTags;

  /** Per-component configurations for the UI. */
  UiComponentConfigs components;

  String deployEnvironment;

  Map<String, Object> extraConfig;

  private static class UiComponentConfigs {
    ArtifactsComponentConfig artifacts;
    BlobStorageComponentConfig blobStorage;
    LoggingComponentConfig logging;
    MetricsComponentConfig metrics;
    SqlComponentConfig sql;
    List<String> clusters;
    AutopilotComponentConfig autopilot;
    AlinkComponentConfig alink;
  }

  private static class ArtifactsComponentConfig {
    Boolean enabled;
  }

  private static class BlobStorageComponentConfig {
    URI baseUri;
  }

  private static class LoggingComponentConfig {
    Boolean enabled;
  }

  private static class MetricsComponentConfig {
    Boolean enabled;
  }

  private static class SqlComponentConfig {
    Boolean enabled;
    CatalogConfigProperties catalogConfig;
    String requiredFlinkImageVersion;
    String requiredFlinkImageTag;
  }

  private static class CatalogConfigProperties {
    private String defaultCatalogName;
    private String defaultDatabaseName;
    private Long catalogCacheMaxSize;
    private Long catalogCacheEvictionIntervalInMins;
    private Long externalCatalogTimeoutInSecs;
    private String confLocalDir;
  }

  private static class AutopilotComponentConfig {
    Boolean enabled;
    AgentFactory agentFactory;
  }

  private static class AlinkComponentConfig {
    Boolean enabled;
  }

  private static enum AgentFactory {
    VVP,
    RTC,
    UNSUPPORTED
  }
}

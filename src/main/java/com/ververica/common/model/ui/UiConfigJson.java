package com.ververica.common.model.ui;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Data;
import lombok.NonNull;

@Data
public class UiConfigJson {
  String version;
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

  @Data
  public static class UiComponentConfigs {
    ArtifactsComponentConfig artifacts;
    BlobStorageComponentConfig blobStorage;
    LoggingComponentConfig logging;
    MetricsComponentConfig metrics;
    SqlComponentConfig sql;
    List<String> clusters;
    AutopilotComponentConfig autopilot;
    AlinkComponentConfig alink;
  }

  @Data
  public static class ArtifactsComponentConfig {
    Boolean enabled;
  }

  @Data
  public static class BlobStorageComponentConfig {
    URI baseUri;
  }

  @Data
  public static class LoggingComponentConfig {
    Boolean enabled;
  }

  @Data
  public static class MetricsComponentConfig {
    Boolean enabled;
  }

  @Data
  public static class SqlComponentConfig {
    Boolean enabled;
    CatalogConfigProperties catalogConfig;
    String requiredFlinkImageVersion;
    String requiredFlinkImageTag;
  }

  @Data
  public static class CatalogConfigProperties {
    private String defaultCatalogName;
    private String defaultDatabaseName;
    private Long catalogCacheMaxSize;
    private Long catalogCacheEvictionIntervalInMins;
    private Long externalCatalogTimeoutInSecs;
    private String confLocalDir;
  }

  @Data
  public static class AutopilotComponentConfig {
    Boolean enabled;
    AgentFactory agentFactory;
  }

  @Data
  public static class AlinkComponentConfig {
    Boolean enabled;
  }

  public static enum AgentFactory {
    VVP,
    RTC,
    UNSUPPORTED
  }

  @Data
  public class LicenseInformation {
    String licensedTo;
    @NonNull Boolean isCommunityEdition;
    String expiresOn;
    @NonNull String cpuQuotaType;
    String cpuQuota;
    Boolean isTrial;
    Boolean isNotForResale;
  }
}

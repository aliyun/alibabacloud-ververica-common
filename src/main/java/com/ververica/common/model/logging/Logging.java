package com.ververica.common.model.logging;

import lombok.Data;

import java.util.Map;

@Data
public class Logging {

  /**
   * The empty String denotes the root logger ¯\_(ツ)_/¯.
   */
  public static final String ROOT_LOGGER = "";

  /**
   * This duplicates the default name constant from DefaultFlinkLoggingProfile (in vvp-config).
   */
  public static final String DEFAULT_LOGGING_PROFILE = "default";

  String loggingProfile;
  String log4j2ConfigurationTemplate;
  Map<String, String> log4jLoggers;
}


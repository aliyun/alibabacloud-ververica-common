package com.ververica.common.model.license;

import lombok.Data;
import lombok.NonNull;

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

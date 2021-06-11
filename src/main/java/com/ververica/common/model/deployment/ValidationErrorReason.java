package com.ververica.common.model.deployment;

public enum ValidationErrorReason {
  // List of reasons
  isMissing,
  isLower,
  isNonPositive,
  hasNotRequiredKey,
  isAfter,
  isInvalid,
}

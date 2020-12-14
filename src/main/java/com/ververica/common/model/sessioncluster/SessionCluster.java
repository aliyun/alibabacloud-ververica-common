package com.ververica.common.model.sessioncluster;

import com.ververica.common.model.deployment.DeploymentStatusRunning;
import com.ververica.common.model.deployment.DeploymentStatusState;
import com.ververica.common.model.logging.Logging;
import com.ververica.common.model.resource.ResourceSpec;
import lombok.Data;

import java.util.Date;
import java.util.Map;

@Data
public class SessionCluster {

     SessionClusterMetadata metadata;
     SessionClusterSpec spec;
     SessionClusterStatus status;

     @Data
     public static class SessionClusterMetadata{
         String id;
         String name;
         String namespace;

         Date createdAt;
         Date modifiedAt;
         Map<String, String> labels;
         Map<String, String> annotations;
         Integer resourceVersion;
     }

    @Data
    public static class SessionClusterSpec{
         SessionClusterState state;
         String deploymentTargetName;
         String flinkVersion;
         String flinkImageRegistry;
         String flinkImageRepository;
         String flinkImageTag;
         Integer numberOfTaskManagers;
         Map<String, ResourceSpec> resources;
         Map<String, String> flinkConfiguration;
         Logging logging;
    }
    @Data
    public static class SessionClusterStatus{
        DeploymentStatusState state;
        DeploymentStatusRunning running;
    }



}

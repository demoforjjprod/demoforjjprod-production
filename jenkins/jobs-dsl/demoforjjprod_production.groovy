
multibranchPipelineJob('demoforjjprod-production') {
  description('Folder for Project demoforjjprod-production generated and maintained by Forjj. To update it use forjj update')
  branchSources {
      github {
          repoOwner('demoforjjprod')
          repository('demoforjjprod-production')
      }
  }
  orphanedItemStrategy {
      discardOldItems {
          numToKeep(20)
      }
  }
}

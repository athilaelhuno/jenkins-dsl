def job = pipelineJob('rundeck/rundeckBuild') {
    definition {
        cps {
            sandbox(true)

        }
        cpsScm {
            scm {
                git {
                    branch('master')
                    remote {
                        url('https://github.com/athilaelhuno/pipelines.git')
                    }
                }
            }
            triggers {
                bitbucketPush()
            }
            scriptPath('build.pipeline')
        }
    }
}
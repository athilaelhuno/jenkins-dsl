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
            scriptPath('build.pipeline')
        }
    }
}
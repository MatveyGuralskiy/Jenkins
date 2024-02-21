println("\tResetting the Jenkins Build Failure and Unstable builds\n")
def job = Jenkins.instance.getItemByFullName("YOUR JOB")
if (job != null) {
    job.getBuilds().findAll { build ->
        build.result == hudson.model.Result.FAILURE || build.result == hudson.model.Result.UNSTABLE
    }.each { successfulBuild ->
        successfulBuild.delete()
    }
} else {
    println("Job 'YOUR JOB' not found")
}
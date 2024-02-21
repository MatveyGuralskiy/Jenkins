println("\tRessiting the Jenkins Build Successfull builds\n")
def job = Jenkins.instance.getItemByFullName("YOUR JOB")
if (job != null) {
    job.getBuilds().each { build ->
        if (build.result == hudson.model.Result.SUCCESS) {
            build.delete()
        }
    }
} else {
    println("Job 'YOUR JOB' not found")
}


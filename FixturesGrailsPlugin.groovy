import grails.plugin.fixtures.FixtureLoader

class FixturesGrailsPlugin {
    def version = "0.9-RC4"
    def dependsOn = [:]

    def author = "Luke Daley"
    def authorEmail = "ld@ldaley.com"
    def title = "fixtures"
    def description = "Allows loading of data sets defined with the BeanBuilder DSL"
    def documentation = "http://grails.org/Fixtures+Plugin"
    def pluginExcludes = [
        "grails-app/domain/**",
        "grails-app/services/**",
        "grails-app/i18n/*",
        "fixtures"
    ]

    def doWithSpring = {
        fixtureLoader(FixtureLoader)
    }
}

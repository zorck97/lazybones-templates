# Lazybones templates
[![Travis CI](https://img.shields.io/travis/zorck97/lazybones-templates.svg?style=for-the-badge)](https://travis-ci.org/zorck97/lazybones-templates)
[![Dependency Check](https://img.shields.io/snyk/vulnerabilities/github/zorck97/lazybones-templates/build.gradle.svg?style=for-the-badge)](https://snyk.io/test/github/zorck97/lazybones-templates?targetFile=build.gradle)

* [Installation](README.md#installation)
* [Usage](README.md#usage)

## Installation

To install the templates to your own computer, clone this repo.

```console
$ git clone https://github.com/zorck97/lazybones-templates.git lazybones-templates && lazybones-templates
```

You can then package and install the templates with the command:

```console
$ ./gradlew installAllTemplates
```

You'll then be able to use Lazybones to create new projects from these templates.

If you then want to distribute them in your own repo, you will need to set up a Bintray account,
populate the `repositoryUrl`, `repositoryUsername` and `repositoryApiKey` settings
in `build.gradle`, add new Bintray packages in the repository via the Bintray
UI, and finally publish the templates with

```console
$ ./gradlew publishAllTemplates
```

## Usage

To create a new project, with the go-project as the base structure, just run:

```console
$ lazybones create go-project 1.0 my-new-shiny-go-project
```
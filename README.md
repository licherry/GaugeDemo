# GaugeDemo

##Install
- $ brew update
- $ brew install gauge
- $ gauge —install java
- $ gauge -v
- $ mvn -v

##Report Plugin
- gauge --install html-report

##Plugin update
- gauge —check-updates
- gauge —update html-report

##Excution

####Excute a regular spec
- mvn gauge:execute -DspecsDir=specs/specname.spec

####Excute via Tags
- mvn gauge:execute -DspecsDir=specs -Dtags="tag name"

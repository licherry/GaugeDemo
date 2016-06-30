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

##Table
- write data table in spec file (sample syntax)

```
|firstName|lastName|email        |password|
|---------|--------|-------------|--------|
|janet    |li      |abc1@abc3.com|11111111|
|mike     |wang    |abc1@abc4.com|11111111|
```

- store data in .csv file (sample syntax)

```
firstName,lastName,email,password
janet,li,abc1@abc777.com,11111111
mike,wang,abc1@abc444.com,11111111
```
`write in spec file: table: src/test/testdata.csv`
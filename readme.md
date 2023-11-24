We must create a settings file to a similar to that 
path "C:\Users\maurogiannopoulos\.m2" with the name "settings.xml"
the settings file must include the following:
<?xml version="1.0" encoding="UTF-8"?>
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 http://maven.apache.org/xsd/settings-1.0.0.xsd">
<servers>
<server>
<id>repo-jfrog</id>
<username>admin</username>
<password>P@ssw0rd</password>
</server>
</servers>
</settings>

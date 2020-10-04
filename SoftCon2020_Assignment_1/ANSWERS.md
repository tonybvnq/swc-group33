**Part 1**

**Part 1.1 Architecture of 3 packages and 10 classes**

Package: src.main.java.orga.joda.time.tz
We chose this package because it contains the main entry point

![alt_text](src.main.java.orga.joda.time.tz.jpg "tz package")


Package: src.main.java.orga.joda.time.convert

![alt_text](ConverterPackage.jpg "convert package")

Package: src.main.java.orga.joda.time.format

![alt_text](FormatPackage.jpg "format package")



**Part 1.2 Call Graph**

Call Graph: If the class is not indicated, the call happens inside the same class

![alt text](Assignment1_CallGraph.jpg "call graph")




**Part 2**

ZoneInfoCompiler.parseTime
If/else

![alt_text](zoneInfoCompiler.parseTime.jpg "parseTime")


ZoneInfoCompiler.formatName
If/else

![alt text](Method1_formatName.jpg "call graph")


DateTimeZoneBuilder.writeMillis
If/else

![alt text](DateTimeZoneBuilder.writeMillis.jpg "writeMillis Graph")


ZoneInfoProvider.openResource
If/else

![alt text](Method2_openResource.jpg "call graph")


ZoneInfoProvider.readZoneInfoMap
For-loop

![alt_text](ZoneInfoProvider.readZoneInfoMap().jpg "readZoneInfoMap")


DateTimeZoneBuilder.isCachable
For-loop

![alt text](DateTimeZoneBuilder.isCachable.jpg "isCachable Graph")





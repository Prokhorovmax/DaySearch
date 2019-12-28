# Software Engineering homework

Made by Prokhorov Max, SPbSTU, gr. 3530901/60202, 2019.

Build and Run

        gradle build
        gradle bootRun

Examples

        request: curl http://localhost:8080/?year=1998
        response: {"errorCode":200,"dataMessage":"13/09/1998"}
  
        request: curl http://localhost:8080/?year=2000
        response: {"errorCode":200,"dataMessage":"12/09/2000"}
        
        request: curl http://localhost:8080?year=0  
        response: {"errorCode":200, "dataMessage":"INCORRECT INPUT"}
        

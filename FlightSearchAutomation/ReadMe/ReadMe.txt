IRCTC Flight Search automation 

Problem Statement:   

-> IRCTC Flight Search automation 
-> Get the list of flights available today from Hyderabad to Pune. 
-> Suggested site: https://www.air.irctc.co.in/ 

Detailed description: 

-> Launch https://www.air.irctc.co.in/ in a web browser, and verify the appropriate site is opened or not. 
-> Maximize the window and verify the respective application is opened or not 
-> Enter "Hyd" in “From” city, in the auto listed results, select "HYDERABAD (HYD)"  
-> Enter "Pune" in "To" city, in the auto listed results, select "PUNE (PNQ)"  
-> Select today’s date from the date picker. 
-> Select "Business" class, from “Choose class” dropdown box in Traveller details field. 
-> Click on "Search" button. 
-> Verify the results shown are valid, by checking the city and date values are same as given in previous page. 
-> Display the name and Number of available Flights on the console 
-> Capture the results screenshot and save in the project folder. 
-> Close the Application. 

Key Automation Scope:

-> Handling multiple browsers Chrome/Edge.
-> Locating elements precisely.
-> Using appropriate synchronization technique.
-> Handling drop down list.
-> Extracting multiple options items & storing in arrays and collections.
-> Using Data driven concept - reading and writing in Sample.xlsx excel file.
-> Storing screenshots in Screenshots folder.

                                                           IMPORTANT NOTE:

1) The site may undergo regular maintenance. During that time the test cannot be performed properly and might
   throw error or exception.
2) Sometimes the site will be down and may take more time to load. If the time exceeds the given time of 30 seconds,
   it might end up in exception.
3) If no flights are available on current date, the driver waits for 30 seconds and closes the browser.
4) If there is any problem with the website kindly view the "SUCCESSFULLY TESTED RECORDING AND SCREENSHOTS" folder which 
   contains previous successfully tested recording and screenshots.
 
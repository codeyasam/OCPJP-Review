/* Q5: Suppose that we have the following property files and code. Which bundles are used on lines 8 and 9 respectively?
*
* Dolphins.properties
* name=The Dolphin
* age=0

* Dolphins_en.properties
* name=Dolly
* age=4

* Dolphins_fr.properties
* name=Dolly

* 5: Locale fr = new Locale("fr");
* 6: Locale.setDefault(new Locale("en", "US"));
* 7: ResourceBundle b = ResourceBundle.getBundle("Dolphins", fr);
* 8: b.getString("name");
* 9: b.getString("age");


* D. Dolphins_fr.properties and Dolphins.properties
*/
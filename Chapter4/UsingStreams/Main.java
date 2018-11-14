/* Three parts to a stream pipeline. 
*
* Source: Where the stream comes from.
* Intermediate Operations: Transforms the stream into another one.
* Terminal Operation: Actional produces a result. Since streams can be used only once, the stream is no longer valid afer a terminal operation completes

* Scenario                                          For Intermediate Operations?                  For Terminal Operations?
* Required part of a useful pipeline?               No                                            Yes
* Can exist multiple times in a pipeline?           Yes                                           No
* Return type is a stream type?                     Yes                                           No
* Executed upon method call?                        No                                            Yes
* Stream valid after call?                          Yes                                           No
*/
/* Providing Optional Arguments 
* 
* Common optional arguments in NIO.2
Enum Value                Usage                      Description
NOFOLLOW_LINKS            Test file existing         If provided, symbolic links when encountered 
                          Read file data             will not be traversed. Useful for performing 
                          Copy file                  operations on symbolic links themselves rather than
                          Move file                  their target.
                          
FOLLOW_LINKS              Traverse a directory       If provided, symbolic links when encountered will be traversed.
COPY_ATTRIBUTES           Copy File                  If provided, all metadata about a file will be copied with it.
REPLACE_EXISTING          Copy file                  If provided and the target file exists, it will be replaced;                               Move File                  otherwise; if it is not provided an exception will be thrown if                                                        the file already exists.
ATOMIC_MOVE               Move File                  The operation is performed in an atomic manner within the file 
                                                     system, ensuring that any process using the file sees only a 
                                                     complete record. Method using it may throw an exception if the
                                                     feature is unsupported by the file system.

An atomic move is one in which any process monitoring the file system never sees an incomplete or partially written file. might throw an AtomicMoveNotSupportedException.
*/
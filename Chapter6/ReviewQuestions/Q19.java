/* Q19: Which of the following cannot fill in the blank? (Choose all that apply.) 

public void read() throws SQLException {
    try {
        readFromDatabase();
    } catch (______ e) {
        throw e;
    }
}

private void readFromDatabase() throws SQLException {} 

* D. SQLException | IOException e     // since there isn't a an IOException to be handled

*/


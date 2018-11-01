/* Q11: Which of the following statements can be inserted to make FootballGame compile?
*/
package my.apps;

import static my.sports.Football.*; // this is it

public class FootballGame {
    public int getTeamSize() {
        return TEAM_SIZE;
    }
}
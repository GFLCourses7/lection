package data;

public class UserData {

    private String login;
    private String password;
    private Long timestamp;

    public UserData() {

    }

    public static class Builder {

        private final UserData userData;

        // Set necessary data
        public Builder(String login) {
            userData = new UserData();
            userData.login = login;
        }

        // Set optional data
        public Builder setPassword(String password) {
            userData.password = password;
            return this;
        }

        public Builder setTimestamp(Long timestamp) {
            userData.timestamp = timestamp;
            return this;
        }

        public UserData build() {
            return userData;
        }

    }

    @Override
    public String toString() {
        return "data.UserData{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}

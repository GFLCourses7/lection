
public class UserData {

    private String login;
    private String password;
    private Long timestamp;

    public UserData() {

    }

    public static class Builder {

        private final UserData userData;

        public Builder() {
            userData = new UserData();
        }

        public Builder setLogin(String login) {
            userData.login = login;
            return this;
        }

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
        return "UserData{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}

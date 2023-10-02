#include <stdio.h>
#include <stdlib.h>
#include <string.h>

extern char **environ;

int main() {
    char input[1024];
    char command[1024];
    char args[1017];

    while (1) {
        printf("==> ");
        fgets(input, sizeof(input), stdin);

        // Remove trailing newline character
        if (strchr(input, '\n')) {
            *strchr(input, '\n') = 0;
        }

        // Extract command and arguments
        if (sscanf(input, "%s %[^\n]", command, args) == 1) {
            args[0] = '\0';
        }

        // Internal Commands
        if (strcmp(command, "myclear") == 0) {
            system("clear");
        } else if (strcmp(command, "mydir") == 0) {
            char ls_command[1024];
            sprintf(ls_command, "ls -al %s", args);
            system(ls_command);
        } else if (strcmp(command, "myenviron") == 0) {
            char **env = environ;
            while (*env) {
                printf("%s\n", *env++);
            }
        } else if (strcmp(command, "myquit") == 0) {
            exit(0);
        } else {
            // External Commands
            system(input);
        }
    }

    return 0;
}

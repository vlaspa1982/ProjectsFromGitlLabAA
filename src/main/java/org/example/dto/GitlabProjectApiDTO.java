package org.example.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GitlabProjectApiDTO {

    int id;
    String name;
    String namespaceName;
    String path;
    int createAt;

}

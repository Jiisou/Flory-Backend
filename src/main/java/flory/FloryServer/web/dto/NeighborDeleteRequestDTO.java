package flory.FloryServer.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NeighborDeleteRequestDTO {
    // private String targetUserToken;
    private Long targetUserId;
}

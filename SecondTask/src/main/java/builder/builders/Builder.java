package builder.builders;

import builder.parts.*;

public interface Builder {
    void setCPU(CPU cpu);

    void setMotherboard(MotherBoard motherBoard);

    void setVideoCard(VideoCard videoCard);

    void setRAM(Integer ram);

    void setHDD(Double hdd);

    void setPSU(Integer psu);

}

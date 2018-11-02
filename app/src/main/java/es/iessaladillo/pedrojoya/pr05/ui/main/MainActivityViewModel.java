package es.iessaladillo.pedrojoya.pr05.ui.main;

import androidx.lifecycle.ViewModel;
import es.iessaladillo.pedrojoya.pr05.data.local.model.Avatar;

public class MainActivityViewModel extends ViewModel {
    public Avatar avatar;

    public Avatar getAvatar() {
        return avatar;
    }

    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }
}

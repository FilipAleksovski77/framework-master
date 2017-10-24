package com.odoo.addons.projects.providers;

import com.odoo.addons.projects.models.ProjectTask;
import com.odoo.core.orm.provider.BaseModelProvider;


/**
 * Created by Korisnik on 21.10.2017.
 */

public class ProjectTaskProvider extends BaseModelProvider{
    public static final String TAG = ProjectTaskProvider.class.getSimpleName();
    @Override
    public String authority() {
        return ProjectTask.AUTHORITY;
    }

}

package com.tcl.launcher;

import com.tcl.launcher.effect.page.IEffectFactory;
import com.tcl.launcher.effect.Workspace;
import com.tcl.launcher.effect.ball.BallEffectorFactory;

import net.ds.effect.R;

/**
 *
 */
public class TestEffectActivity extends BaseActivity {
    Workspace workspace;

    @Override
    protected void setContentView() {
        setContentView(R.layout.activity_test_effect_layout);
    }

    @Override
    protected void initViews() {
        workspace = (Workspace) findViewById(R.id.workspace);
        IEffectFactory factory = new BallEffectorFactory();
        workspace.setEffector(factory.createEffector());
        workspace.setPageLoop(true);//设置页面循环
    }

    @Override
    protected void bindListener() {

    }
}

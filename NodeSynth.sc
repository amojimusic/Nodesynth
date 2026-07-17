
//add curving lines
//make it an actual synth



NodeSynth {
	var <>window, <>osc1, <>osc2, <>oscWidth = 200, <>oscHeight = 150, <>windowWidth = 850, <>windowHeight = 600, windowX = 250, windowY = 100, <>n0, <>n1, <>n2, <>n3, <>n4, <>n5, <>n6, <>n7, <>n8, <>n9, <>n10, <>n11, <>n12, <>n13, <>n14, <>n15, <>n16, <>n17, <>n18, <>n19, <>n20, <>n21, <>n22, <>n23, <>n24, <>n25, <>n26, <>wave1, <>wave2, <>voice1, <>voice2, <>voice3, <>voice4, <>voice5, <>voice6, <>voice7, <>voice8, <>synthDef, <>synth, <>synthName, <>synthDefFunc, <>nDef, <>fadeTime, <>osc1AmpSlider, <>osc2AmpSlider, <>osc1FreqSlider, <>osc2FreqSlider, <>envOsc1, <>envOsc2, <>envOsc1AmpSlider, <>envOsc1LengthSlider, <>envOsc2AmpSlider, <>envOsc2LengthSlider;

	*new {
		^super.new;
	}

	inst {


		n0 = NodeSynthNode.new;
		n1 = NodeSynthNode.new;
		n2 = NodeSynthNode.new;
		n3 = NodeSynthNode.new;
		n4 = NodeSynthNode.new;
		n5 = NodeSynthNode.new;
		n6 = NodeSynthNode.new;
		n7 = NodeSynthNode.new;
		n8 = NodeSynthNode.new;

		n9 = NodeSynthNode.new;
		n10 = NodeSynthNode.new;
		n11 = NodeSynthNode.new;
		n12 = NodeSynthNode.new;
		n13 = NodeSynthNode.new;
		n14 = NodeSynthNode.new;
		n15 = NodeSynthNode.new;
		n16 = NodeSynthNode.new;
		n17 = NodeSynthNode.new;

		n18 = NodeSynthNode.new;
		n19 = NodeSynthNode.new;
		n20 = NodeSynthNode.new;
		n21 = NodeSynthNode.new;
		n22 = NodeSynthNode.new;
		n23 = NodeSynthNode.new;
		n24 = NodeSynthNode.new;
		n25 = NodeSynthNode.new;
		n26 = NodeSynthNode.new;

		n0.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;

		n9.next = n10;
		n10.next = n11;
		n11.next = n12;
		n12.next = n13;
		n13.next = n14;
		n14.next = n15;
		n15.next = n16;
		n16.next = n17;

		n18.next = n19;
		n19.next = n20;
		n20.next = n21;
		n21.next = n22;
		n22.next = n23;
		n23.next = n24;
		n24.next = n25;
		n25.next = n26;


		n0.nodeSynthClass = this;
		n1.nodeSynthClass = this;
		n2.nodeSynthClass = this;
		n3.nodeSynthClass = this;
		n4.nodeSynthClass = this;
		n5.nodeSynthClass = this;
		n6.nodeSynthClass = this;
		n7.nodeSynthClass = this;
		n8.nodeSynthClass = this;

		n9.nodeSynthClass = this;
		n10.nodeSynthClass = this;
		n11.nodeSynthClass = this;
		n12.nodeSynthClass = this;
		n13.nodeSynthClass = this;
		n14.nodeSynthClass = this;
		n15.nodeSynthClass = this;
		n16.nodeSynthClass = this;
		n17.nodeSynthClass = this;

		n18.nodeSynthClass = this;
		n19.nodeSynthClass = this;
		n20.nodeSynthClass = this;
		n21.nodeSynthClass = this;
		n22.nodeSynthClass = this;
		n23.nodeSynthClass = this;
		n24.nodeSynthClass = this;
		n25.nodeSynthClass = this;
		n26.nodeSynthClass = this;

		n0.x = 0;
		n1.x = 25;
		n2.x = 50;
		n3.x = 75;
		n4.x = 100;
		n5.x = 125;
		n6.x = 150;
		n7.x = 175;
		n8.x = 200;

		n9.x = 0;
		n10.x = 25;
		n11.x = 50;
		n12.x = 75;
		n13.x = 100;
		n14.x = 125;
		n15.x = 150;
		n16.x = 175;
		n17.x = 200;

		n18.x = 0;
		n19.x = 25;
		n20.x = 50;
		n21.x = 75;
		n22.x = 100;
		n23.x = 125;
		n24.x = 150;
		n25.x = 175;
		n26.x = 200;

		n0.y = 75;
		n1.y = 75;
		n2.y = 75;
		n3.y = 75;
		n4.y = 75;
		n5.y = 75;
		n6.y = 75;
		n7.y = 75;
		n8.y = 75;

		n9.y = 75;
		n10.y = 75;
		n11.y = 75;
		n12.y = 75;
		n13.y = 75;
		n14.y = 75;
		n15.y = 75;
		n16.y = 75;
		n17.y = 75;

		n18.y = 150;
		n19.y = 75;
		n20.y = 75;
		n21.y = 75;
		n22.y = 75;
		n23.y = 75;
		n24.y = 75;
		n25.y = 75;
		n26.y = 150;

		n1.rect = Rect(n1.x - 5, n1.y - 5, 10, 10);
		n2.rect = Rect(n2.x - 5, n2.y - 5, 10, 10);
		n3.rect = Rect(n3.x - 5, n3.y - 5, 10, 10);
		n4.rect = Rect(n4.x - 5, n4.y - 5, 10, 10);
		n5.rect = Rect(n5.x - 5, n5.y - 5, 10, 10);
		n6.rect = Rect(n6.x - 5, n6.y - 5, 10, 10);
		n7.rect = Rect(n7.x - 5, n7.y - 5, 10, 10);

		n10.rect = Rect(n1.x - 5, n1.y - 5, 10, 10);
		n11.rect = Rect(n2.x - 5, n2.y - 5, 10, 10);
		n12.rect = Rect(n3.x - 5, n3.y - 5, 10, 10);
		n13.rect = Rect(n4.x - 5, n4.y - 5, 10, 10);
		n14.rect = Rect(n5.x - 5, n5.y - 5, 10, 10);
		n15.rect = Rect(n6.x - 5, n6.y - 5, 10, 10);
		n16.rect = Rect(n7.x - 5, n7.y - 5, 10, 10);

		n19.rect = Rect(n1.x - 5, n1.y - 5, 10, 10);
		n20.rect = Rect(n2.x - 5, n2.y - 5, 10, 10);
		n21.rect = Rect(n3.x - 5, n3.y - 5, 10, 10);
		n22.rect = Rect(n4.x - 5, n4.y - 5, 10, 10);
		n23.rect = Rect(n5.x - 5, n5.y - 5, 10, 10);
		n24.rect = Rect(n6.x - 5, n6.y - 5, 10, 10);
		n25.rect = Rect(n7.x - 5, n7.y - 5, 10, 10);

		n1.view = View(osc1, n1.rect);
		n2.view = View(osc1, n2.rect);
		n3.view = View(osc1, n3.rect);
		n4.view = View(osc1, n4.rect);
		n5.view = View(osc1, n5.rect);
		n6.view = View(osc1, n6.rect);
		n7.view = View(osc1, n7.rect);

		n10.view = View(osc1, n1.rect);
		n11.view = View(osc1, n2.rect);
		n12.view = View(osc1, n3.rect);
		n13.view = View(osc1, n4.rect);
		n14.view = View(osc1, n5.rect);
		n15.view = View(osc1, n6.rect);
		n16.view = View(osc1, n7.rect);

		n19.view = View(osc1, n1.rect);
		n20.view = View(osc1, n2.rect);
		n21.view = View(osc1, n3.rect);
		n22.view = View(osc1, n4.rect);
		n23.view = View(osc1, n5.rect);
		n24.view = View(osc1, n6.rect);
		n25.view = View(osc1, n7.rect);


		window = NodeSynthWindow.new;
		window.nodeSynthClass = this;
		window.open(windowX, windowY, windowWidth, windowHeight);

		osc1 = NodeSynthOsc.new;
		osc1.nodeSynthClass = this;
		osc1.n0 = n0;
		osc1.n1 = n1;
		osc1.n2 = n2;
		osc1.n3 = n3;
		osc1.n4 = n4;
		osc1.n5 = n5;
		osc1.n6 = n6;
		osc1.n7 = n7;
		osc1.n8 = n8;
		osc1.makeView(10, 20, oscWidth, oscHeight);
		wave1 = osc1.makeWave;

		osc1AmpSlider = NodeSynthWindow.new.createSlider(window.window, oscWidth + 20, 20, 12, oscHeight);

		osc1FreqSlider = NodeSynthWindow.new.createSlider(window.window, oscWidth + 40, 20, 12, oscHeight);


		osc2 = NodeSynthOsc.new;
		osc2.nodeSynthClass = this;
		osc2.n0 = n9;
		osc2.n1 = n10;
		osc2.n2 = n11;
		osc2.n3 = n12;
		osc2.n4 = n13;
		osc2.n5 = n14;
		osc2.n6 = n15;
		osc2.n7 = n16;
		osc2.n8 = n17;
		osc2.makeView(oscWidth + 50 + 10, 20, oscWidth, oscHeight);
		wave2 = osc2.makeWave;

		osc2AmpSlider = NodeSynthWindow.new.createSlider(window.window, oscWidth + 50 + oscWidth + 20, 20, 12, oscHeight);

		osc2FreqSlider = NodeSynthWindow.new.createSlider(window.window, oscWidth + 70 + oscWidth + 20, 20, 12, oscHeight);


		envOsc1 = NodeSynthOsc.new;
		envOsc1.nodeSynthClass = this;
		envOsc1.n0 = n18;
		envOsc1.n1 = n19;
		envOsc1.n2 = n20;
		envOsc1.n3 = n21;
		envOsc1.n4 = n22;
		envOsc1.n5 = n23;
		envOsc1.n6 = n24;
		envOsc1.n7 = n25;
		envOsc1.n8 = n26;
		envOsc1.makeView(oscWidth + 50 + oscWidth + 50 + 10, 20, oscWidth, oscHeight);

		envOsc1AmpSlider = NodeSynthWindow.new.createSlider(window.window, oscWidth + 50 + oscWidth + 50 + 20 + oscWidth, 20, 12, oscHeight);

		envOsc1LengthSlider = NodeSynthWindow.new.createSlider(window.window, oscWidth + 50 + oscWidth + 50 + 20 + 20 + oscWidth, 20, 12, oscHeight);


		n0.envBool = false;
		n1.envBool = false;
		n2.envBool = false;
		n3.envBool = false;
		n4.envBool = false;
		n5.envBool = false;
		n6.envBool = false;
		n7.envBool = false;
		n8.envBool = false;
		n9.envBool = false;
		n10.envBool = false;
		n11.envBool = false;
		n12.envBool = false;
		n13.envBool = false;
		n14.envBool = false;
		n15.envBool = false;
		n16.envBool = false;
		n17.envBool = false;

		n18.envBool = true;
		n19.envBool = true;
		n20.envBool = true;
		n21.envBool = true;
		n22.envBool = true;
		n23.envBool = true;
		n24.envBool = true;
		n25.envBool = true;
		n26.envBool = true;

		n19.sustainBool = true;


		synthName = \nsSynth;


		^this;

	}

	open {

		this.inst;


		^window;
	}

	makeSynth {
		if(synthName.isNil){
			synthName = \nsSynth;
		};

		wave1 = osc1.makeWave;
		wave2 = osc2.makeWave;
		fadeTime = 1;

		/*synthDefFunc = {
			arg freq = 440, mul = 0.5, pan = 0, out = 0, w = wave, sel = 0;
			var buf, sig;
			buf = Select.kr(sel, [Buffer.alloc(Server.local, wave.size).loadCollection(wave), Buffer.alloc(Server.local, wave.size).loadCollection(wave)]);
			sig = Osc.ar(buf, freq, 0, mul);
			sig = Pan2.ar(sig, pan);
			Out.ar(out, sig);

		};

		synthDef = SynthDef.new(synthName, {
			arg freq = 440, mul = 0.5, pan = 0, out = 0, w = wave, sel = 0;
			var buf, sig;
			buf = Select.kr(sel, [Buffer.alloc(Server.local, wave.size).loadCollection(wave), Buffer.alloc(Server.local, wave.size).loadCollection(wave)]);
			sig = Osc.ar(buf, freq, 0, mul);
			sig = Pan2.ar(sig, pan);
			Out.ar(out, sig);

		}).add;*/

		/*nDef = Ndef(synthName, {
			arg freq = 440, mul = 0.5, pan = 0, out = 0, w = wave, sel = 0;
			var buf, sig;
			buf = Select.kr(sel, [Buffer.alloc(Server.local, wave.size).loadCollection(wave), Buffer.alloc(Server.local, wave.size).loadCollection(wave)]);
			sig = Osc.ar(buf, freq, 0, mul);
			sig = Pan2.ar(sig, pan);
			Out.ar(out, sig);

		});

		nDef.fadeTime_(fadeTime);*/







	}
}







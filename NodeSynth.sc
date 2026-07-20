
//add curving lines
//make it an actual synth



NodeSynth {
	var <>window, <>osc1, <>osc2, <>oscWidth = 200, <>oscHeight = 150, <>windowWidth = 850, <>windowHeight = 600, windowX = 250, windowY = 100, <>n0, <>n1, <>n2, <>n3, <>n4, <>n5, <>n6, <>n7, <>n8, <>n9, <>n10, <>n11, <>n12, <>n13, <>n14, <>n15, <>n16, <>n17, <>n18, <>n19, <>n20, <>n21, <>n22, <>n23, <>n24, <>n25, <>n26, <>n27, <>n28, <>n29, <>n30, <>n31, <>n32, <>n33, <>n34, <>n35, <>n36, <>n37, <>n38, <>n39, <>n40, <>n41, <>n42, <>n43, <>n44, <>n45, <>n46, <>n47, <>n48, <>n49, <>n50, <>n51, <>n52, <>n53, <>n54, <>n55, <>n56, <>n57, <>n58, <>n59, <>n60, <>n61, <>n62, <>n63, <>n64, <>n65, <>wave1, <>wave2, <>voice1, <>voice2, <>voice3, <>voice4, <>voice5, <>voice6, <>voice7, <>voice8, <>synthDef, <>synth, <>synthName, <>synthDefFunc, <>nDef, <>fadeTime, <>osc1AmpSlider, <>osc2AmpSlider, <>osc1FreqSlider, <>osc2FreqSlider, <>envOsc1, <>envOsc2, <>envOsc1AmpSlider, <>envOsc1LengthSlider, <>envOsc2AmpSlider, <>envOsc2LengthSlider, <>lfo1, <>lfo2, <>lfo3, <>lfo1AmpSlider, <>lfo1FreqSlider, <>lfo2AmpSlider, <>lfo2FreqSlider, <>lfo3AmpSlider, <>lfo3FreqSlider;

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

		n27 = NodeSynthNode.new;
		n28 = NodeSynthNode.new;
		n29 = NodeSynthNode.new;
		n30 = NodeSynthNode.new;
		n31 = NodeSynthNode.new;
		n32 = NodeSynthNode.new;
		n33 = NodeSynthNode.new;
		n34 = NodeSynthNode.new;
		n35 = NodeSynthNode.new;

		n36 = NodeSynthNode.new;
		n37 = NodeSynthNode.new;
		n38 = NodeSynthNode.new;
		n39 = NodeSynthNode.new;
		n40 = NodeSynthNode.new;
		n41 = NodeSynthNode.new;
		n42 = NodeSynthNode.new;
		n43 = NodeSynthNode.new;
		n44 = NodeSynthNode.new;

		n45 = NodeSynthNode.new;
		n46 = NodeSynthNode.new;
		n47 = NodeSynthNode.new;
		n48 = NodeSynthNode.new;
		n49 = NodeSynthNode.new;
		n50 = NodeSynthNode.new;
		n51 = NodeSynthNode.new;
		n52 = NodeSynthNode.new;
		n53 = NodeSynthNode.new;

		n54 = NodeSynthNode.new;
		n55 = NodeSynthNode.new;
		n56 = NodeSynthNode.new;
		n57 = NodeSynthNode.new;
		n58 = NodeSynthNode.new;
		n59 = NodeSynthNode.new;
		n60 = NodeSynthNode.new;
		n61 = NodeSynthNode.new;
		n62 = NodeSynthNode.new;

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

		n27.next = n28;
		n28.next = n29;
		n29.next = n30;
		n30.next = n31;
		n31.next = n32;
		n32.next = n33;
		n33.next = n34;
		n34.next = n35;

		n36.next = n37;
		n37.next = n38;
		n38.next = n39;
		n39.next = n40;
		n40.next = n41;
		n41.next = n42;
		n42.next = n43;
		n43.next = n44;

		n45.next = n46;
		n46.next = n47;
		n47.next = n48;
		n48.next = n49;
		n49.next = n50;
		n50.next = n51;
		n51.next = n52;
		n52.next = n53;

		n54.next = n55;
		n55.next = n56;
		n56.next = n57;
		n57.next = n58;
		n58.next = n59;
		n59.next = n60;
		n60.next = n61;
		n61.next = n62;


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

		n27.nodeSynthClass = this;
		n28.nodeSynthClass = this;
		n29.nodeSynthClass = this;
		n30.nodeSynthClass = this;
		n31.nodeSynthClass = this;
		n32.nodeSynthClass = this;
		n33.nodeSynthClass = this;
		n34.nodeSynthClass = this;
		n35.nodeSynthClass = this;

		n36.nodeSynthClass = this;
		n37.nodeSynthClass = this;
		n38.nodeSynthClass = this;
		n39.nodeSynthClass = this;
		n40.nodeSynthClass = this;
		n41.nodeSynthClass = this;
		n42.nodeSynthClass = this;
		n43.nodeSynthClass = this;
		n44.nodeSynthClass = this;

		n45.nodeSynthClass = this;
		n46.nodeSynthClass = this;
		n47.nodeSynthClass = this;
		n48.nodeSynthClass = this;
		n49.nodeSynthClass = this;
		n50.nodeSynthClass = this;
		n51.nodeSynthClass = this;
		n52.nodeSynthClass = this;
		n53.nodeSynthClass = this;

		n54.nodeSynthClass = this;
		n55.nodeSynthClass = this;
		n56.nodeSynthClass = this;
		n57.nodeSynthClass = this;
		n58.nodeSynthClass = this;
		n59.nodeSynthClass = this;
		n60.nodeSynthClass = this;
		n61.nodeSynthClass = this;
		n62.nodeSynthClass = this;

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

		n27.x = 0;
		n28.x = 25;
		n29.x = 50;
		n30.x = 75;
		n31.x = 100;
		n32.x = 125;
		n33.x = 150;
		n34.x = 175;
		n35.x = 200;

		n36.x = 0;
		n37.x = 25;
		n38.x = 50;
		n39.x = 75;
		n40.x = 100;
		n41.x = 125;
		n42.x = 150;
		n43.x = 175;
		n44.x = 200;

		n45.x = 0;
		n46.x = 25;
		n47.x = 50;
		n48.x = 75;
		n49.x = 100;
		n50.x = 125;
		n51.x = 150;
		n52.x = 175;
		n53.x = 200;

		n54.x = 0;
		n55.x = 25;
		n56.x = 50;
		n57.x = 75;
		n58.x = 100;
		n59.x = 125;
		n60.x = 150;
		n61.x = 175;
		n62.x = 200;

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

		n27.y = 150;
		n28.y = 75;
		n29.y = 75;
		n30.y = 75;
		n31.y = 75;
		n32.y = 75;
		n33.y = 75;
		n34.y = 75;
		n35.y = 150;

		n36.y = 75;
		n37.y = 75;
		n38.y = 75;
		n39.y = 75;
		n40.y = 75;
		n41.y = 75;
		n42.y = 75;
		n43.y = 75;
		n44.y = 75;

		n45.y = 75;
		n46.y = 75;
		n47.y = 75;
		n48.y = 75;
		n49.y = 75;
		n50.y = 75;
		n51.y = 75;
		n52.y = 75;
		n53.y = 75;

		n54.y = 75;
		n55.y = 75;
		n56.y = 75;
		n57.y = 75;
		n58.y = 75;
		n59.y = 75;
		n60.y = 75;
		n61.y = 75;
		n62.y = 75;

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

		n19.rect = Rect(n19.x - 5, n19.y - 5, 10, 10);
		n20.rect = Rect(n2.x - 5, n2.y - 5, 10, 10);
		n21.rect = Rect(n3.x - 5, n3.y - 5, 10, 10);
		n22.rect = Rect(n4.x - 5, n4.y - 5, 10, 10);
		n23.rect = Rect(n5.x - 5, n5.y - 5, 10, 10);
		n24.rect = Rect(n6.x - 5, n6.y - 5, 10, 10);
		n25.rect = Rect(n25.x - 5, n25.y - 5, 10, 10);

		n27.rect = Rect(n27.x - 5, n27.y - 5, 10, 10);
		n28.rect = Rect(n2.x - 5, n2.y - 5, 10, 10);
		n29.rect = Rect(n3.x - 5, n3.y - 5, 10, 10);
		n30.rect = Rect(n4.x - 5, n4.y - 5, 10, 10);
		n31.rect = Rect(n5.x - 5, n5.y - 5, 10, 10);
		n32.rect = Rect(n6.x - 5, n6.y - 5, 10, 10);
		n33.rect = Rect(n33.x - 5, n33.y - 5, 10, 10);

		n35.rect = Rect(n26.x - 5, n36.y - 5, 10, 10);
		n36.rect = Rect(n2.x - 5, n2.y - 5, 10, 10);
		n37.rect = Rect(n3.x - 5, n3.y - 5, 10, 10);
		n38.rect = Rect(n4.x - 5, n4.y - 5, 10, 10);
		n39.rect = Rect(n5.x - 5, n5.y - 5, 10, 10);
		n40.rect = Rect(n6.x - 5, n6.y - 5, 10, 10);
		n41.rect = Rect(n42.x - 5, n42.y - 5, 10, 10);

		n44.rect = Rect(n1.x - 5, n1.y - 5, 10, 10);
		n45.rect = Rect(n2.x - 5, n2.y - 5, 10, 10);
		n46.rect = Rect(n3.x - 5, n3.y - 5, 10, 10);
		n47.rect = Rect(n4.x - 5, n4.y - 5, 10, 10);
		n48.rect = Rect(n5.x - 5, n5.y - 5, 10, 10);
		n49.rect = Rect(n6.x - 5, n6.y - 5, 10, 10);
		n50.rect = Rect(n7.x - 5, n7.y - 5, 10, 10);

		n53.rect = Rect(n1.x - 5, n1.y - 5, 10, 10);
		n54.rect = Rect(n2.x - 5, n2.y - 5, 10, 10);
		n55.rect = Rect(n3.x - 5, n3.y - 5, 10, 10);
		n56.rect = Rect(n4.x - 5, n4.y - 5, 10, 10);
		n57.rect = Rect(n5.x - 5, n5.y - 5, 10, 10);
		n58.rect = Rect(n6.x - 5, n6.y - 5, 10, 10);
		n59.rect = Rect(n7.x - 5, n7.y - 5, 10, 10);

		n1.view = View(osc1, n1.rect);
		n2.view = View(osc1, n2.rect);
		n3.view = View(osc1, n3.rect);
		n4.view = View(osc1, n4.rect);
		n5.view = View(osc1, n5.rect);
		n6.view = View(osc1, n6.rect);
		n7.view = View(osc1, n7.rect);

		n10.view = View(osc2, n1.rect);
		n11.view = View(osc2, n2.rect);
		n12.view = View(osc2, n3.rect);
		n13.view = View(osc2, n4.rect);
		n14.view = View(osc2, n5.rect);
		n15.view = View(osc2, n6.rect);
		n16.view = View(osc2, n7.rect);

		n19.view = View(envOsc1, n1.rect);
		n20.view = View(envOsc1, n2.rect);
		n21.view = View(envOsc1, n3.rect);
		n22.view = View(envOsc1, n4.rect);
		n23.view = View(envOsc1, n5.rect);
		n24.view = View(envOsc1, n6.rect);
		n25.view = View(envOsc1, n7.rect);

		n27.view = View(envOsc2, n1.rect);
		n28.view = View(envOsc2, n2.rect);
		n29.view = View(envOsc2, n3.rect);
		n30.view = View(envOsc2, n4.rect);
		n31.view = View(envOsc2, n5.rect);
		n32.view = View(envOsc2, n6.rect);
		n33.view = View(envOsc2, n7.rect);

		n36.view = View(osc1, n1.rect);
		n37.view = View(osc1, n2.rect);
		n38.view = View(osc1, n3.rect);
		n39.view = View(osc1, n4.rect);
		n40.view = View(osc1, n5.rect);
		n41.view = View(osc1, n6.rect);
		n42.view = View(osc1, n7.rect);

		n45.view = View(osc1, n1.rect);
		n46.view = View(osc1, n2.rect);
		n47.view = View(osc1, n3.rect);
		n48.view = View(osc1, n4.rect);
		n49.view = View(osc1, n5.rect);
		n50.view = View(osc1, n6.rect);
		n51.view = View(osc1, n7.rect);

		n54.view = View(osc1, n1.rect);
		n55.view = View(osc1, n2.rect);
		n56.view = View(osc1, n3.rect);
		n57.view = View(osc1, n4.rect);
		n58.view = View(osc1, n5.rect);
		n59.view = View(osc1, n6.rect);
		n60.view = View(osc1, n7.rect);




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

		envOsc2 = NodeSynthOsc.new;
		envOsc2.nodeSynthClass = this;
		envOsc2.n0 = n27;
		envOsc2.n1 = n28;
		envOsc2.n2 = n29;
		envOsc2.n3 = n30;
		envOsc2.n4 = n31;
		envOsc2.n5 = n32;
		envOsc2.n6 = n33;
		envOsc2.n7 = n34;
		envOsc2.n8 = n35;
		envOsc2.makeView(oscWidth + 50 + oscWidth + 50 + 10, 30 + oscHeight, oscWidth, oscHeight);

		envOsc2AmpSlider = NodeSynthWindow.new.createSlider(window.window, oscWidth + 50 + oscWidth + 50 + 20 + oscWidth, 30 + oscHeight, 12, oscHeight);

		envOsc2LengthSlider = NodeSynthWindow.new.createSlider(window.window, oscWidth + 50 + oscWidth + 50 + 20 + 20 + oscWidth, 30 + oscHeight, 12, oscHeight);

		lfo1 = NodeSynthOsc.new;
		lfo1.nodeSynthClass = this;
		lfo1.n0 = n36;
		lfo1.n1 = n37;
		lfo1.n2 = n38;
		lfo1.n3 = n39;
		lfo1.n4 = n40;
		lfo1.n5 = n41;
		lfo1.n6 = n42;
		lfo1.n7 = n43;
		lfo1.n8 = n44;
		lfo1.makeView(10, 10 + oscHeight + 30 + oscHeight, oscWidth, oscHeight);

		lfo1AmpSlider = NodeSynthWindow.new.createSlider(window.window, oscWidth + 20, 10 + oscHeight + 30 + oscHeight, 12, oscHeight);

		lfo1FreqSlider = NodeSynthWindow.new.createSlider(window.window, oscWidth + 40, 10 + oscHeight + 30 + oscHeight, 12, oscHeight);

		lfo2 = NodeSynthOsc.new;
		lfo2.nodeSynthClass = this;
		lfo2.n0 = n45;
		lfo2.n1 = n46;
		lfo2.n2 = n47;
		lfo2.n3 = n48;
		lfo2.n4 = n49;
		lfo2.n5 = n50;
		lfo2.n6 = n51;
		lfo2.n7 = n52;
		lfo2.n8 = n53;
		lfo2.makeView(10 + oscWidth + 50, 10 + oscHeight + 30 + oscHeight, oscWidth, oscHeight);

		lfo2AmpSlider = NodeSynthWindow.new.createSlider(window.window, oscWidth + 50 + oscWidth + 20, 10 + oscHeight + 30 + oscHeight, 12, oscHeight);

		lfo2FreqSlider = NodeSynthWindow.new.createSlider(window.window, oscWidth + 70 + oscWidth + 20, 10 + oscHeight + 30 + oscHeight, 12, oscHeight);

		lfo3 = NodeSynthOsc.new;
		lfo3.nodeSynthClass = this;
		lfo3.n0 = n54;
		lfo3.n1 = n55;
		lfo3.n2 = n56;
		lfo3.n3 = n57;
		lfo3.n4 = n58;
		lfo3.n5 = n59;
		lfo3.n6 = n60;
		lfo3.n7 = n61;
		lfo3.n8 = n62;
		lfo3.makeView(10 + oscWidth + 50 + oscWidth + 50, 10 + oscHeight + 30 + oscHeight, oscWidth, oscHeight);

		lfo3AmpSlider = NodeSynthWindow.new.createSlider(window.window, oscWidth + 50 + oscWidth + 20 + oscWidth + 50, 10 + oscHeight + 30 + oscHeight, 12, oscHeight);

		lfo3FreqSlider = NodeSynthWindow.new.createSlider(window.window, oscWidth + 70 + oscWidth + 20 + oscWidth + 50, 10 + oscHeight + 30 + oscHeight, 12, oscHeight);



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

		n27.envBool = true;
		n28.envBool = true;
		n29.envBool = true;
		n30.envBool = true;
		n31.envBool = true;
		n32.envBool = true;
		n33.envBool = true;
		n34.envBool = true;
		n35.envBool = true;

		n19.sustainBool = true;
		n28.sustainBool = true;


		synthName = \nsSynth;


		^this;

	}

	open {

		this.inst;


		^window;
	}

	/*makeSynth {
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







	}*/

	makeSynth {
		wave1 = osc1.makeWave;
		wave2 = osc2.makeWave;
		Ndef(synthName, {
			var sig;
			sig = Osc.ar(Buffer.alloc(Server.local, wave1.size).loadCollection(wave1));

			sig = sig ! 2;
		});

	}


	playSynth {

		Ndef(synthName).play;
		"played".postln;
	}
}







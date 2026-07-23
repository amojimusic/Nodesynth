
NodeSynthWindow {

	var <>window, <>nodeSynthClass, <>slider, <>sliderKnob, <>sliderValue, <>knob, <>knobValue, <>numBox;

	*new {
		^super.new;
	}

	open {
		arg x, y, width, height;
		window = Window("Nodesynth", Rect(x, y, width, height)).background_(Color.black);
		window.front;

		^window;
	}

	createSlider {
		arg parent, x, y, width, height;

		if(sliderValue.isNil){
			sliderValue = 0.5;
		};

		slider = UserView.new(parent, Rect(x, y, width, height)).background_(Color.white);
		sliderKnob = Rect(0, (height * (sliderValue)).neg + height - (width/2), width, width);


		slider.drawFunc_({
			Pen.addRect(Rect(x, y, width, height));
			Pen.addOval(sliderKnob);
			Pen.strokeColor_(Color.black);
			Pen.stroke;

		});



		slider.mouseMoveAction_({
			arg v, xVal, yVal;
			if(yVal >= height){
				yVal = height;
			};
			if(yVal <= 0){
				yVal = 0;
			};
			sliderKnob = (Rect(0, yVal - (width / 2), width, width));
			sliderValue = (yVal/height).neg + 1.0;
			parent.refresh;

		});

		slider.mouseDownAction_({
			arg v, xVal, yVal;
			if(yVal >= height){
				yVal = height;
			};
			if(yVal <= 0){
				yVal = 0;
			};
			sliderKnob = (Rect(0, yVal - (width / 2), width, width));
			sliderValue = (yVal/height).neg + 1.0;
			parent.refresh;

		});






	}

}

NodeSynthOsc {
	var <>view, <>parent, <>nodeSynthClass, <>n1, <>n2, <>n3, <>n4, <>n5, <>n6, <>n7, <>n0, <>n8, <>wave;

	*new {
		^super.new;
	}

	inst {
		/*
		n0 = nodeSynthClass.n0;
		n1 = nodeSynthClass.n1;
		n2 = nodeSynthClass.n2;
		n3 = nodeSynthClass.n3;
		n4 = nodeSynthClass.n4;
		n5 = nodeSynthClass.n5;
		n6 = nodeSynthClass.n6;
		n7 = nodeSynthClass.n7;
		n8 = nodeSynthClass.n8;
		*/
		parent = nodeSynthClass.window.window;
		//nodeSynthClass.makeSynth;


	}

	makeView {
		arg x, y, width, height;
		this.inst;
		parent = nodeSynthClass.window.window;
		view = UserView(nodeSynthClass.window.window, Rect(x, y, width, height)).background = Color.white;
		view.drawFunc_({

			var zero, first, sec, thir, four, fif, six, sev, eigh;
			zero = n0.sort;
			first = n0.next;
			sec = first.next;
			thir = sec.next;
			four = thir.next;
			fif = four.next;
			six = fif.next;
			sev = six.next;

			Pen.moveTo(zero.x@zero.y);
			Pen.lineTo(first.x@first.y);
			Pen.lineTo(sec.x@sec.y);
			Pen.lineTo(thir.x@thir.y);
			Pen.lineTo(four.x@four.y);
			Pen.lineTo(fif.x@fif.y);
			Pen.lineTo(six.x@six.y);
			Pen.lineTo(sev.x@sev.y);
			Pen.lineTo(n8.x@n8.y);
			Pen.addOval(Rect(n1.x - 5, n1.y - 5, 10, 10));
			Pen.addOval(Rect(n2.x - 5, n2.y - 5, 10, 10));
			Pen.addOval(Rect(n3.x - 5, n3.y - 5, 10, 10));
			Pen.addOval(Rect(n4.x - 5, n4.y - 5, 10, 10));
			Pen.addOval(Rect(n5.x - 5, n5.y - 5, 10, 10));
			Pen.addOval(Rect(n6.x - 5, n6.y - 5, 10, 10));
			Pen.addOval(Rect(n7.x - 5, n7.y - 5, 10, 10));


			Pen.stroke;

			if(n1.sustainBool){
				Pen.addOval(n1.view.bounds);
				Pen.fillStroke;
			};

			if(n2.sustainBool){
				Pen.addOval(n2.view.bounds);
				Pen.fillStroke;
			};

			if(n3.sustainBool){
				Pen.addOval(n3.view.bounds);
				Pen.fillStroke;
			};

			if(n4.sustainBool){
				Pen.addOval(n4.view.bounds);
				Pen.fillStroke;
			};

			if(n5.sustainBool){
				Pen.addOval(n5.view.bounds);
				Pen.fillStroke;
			};

			if(n6.sustainBool){
				Pen.addOval(n6.view.bounds);
				Pen.fillStroke;
			};

			if(n7.sustainBool){
				Pen.addOval(n7.view.bounds);
				Pen.fillStroke;
			};

		});

		n1.rect = Rect(n1.x - 5, n1.y - 5, 10, 10);
		n2.rect = Rect(n2.x - 5, n2.y - 5, 10, 10);
		n3.rect = Rect(n3.x - 5, n3.y - 5, 10, 10);
		n4.rect = Rect(n4.x - 5, n4.y - 5, 10, 10);
		n5.rect = Rect(n5.x - 5, n5.y - 5, 10, 10);
		n6.rect = Rect(n6.x - 5, n6.y - 5, 10, 10);
		n7.rect = Rect(n7.x - 5, n7.y - 5, 10, 10);

		n1.view = View(view, n1.rect);
		n2.view = View(view, n2.rect);
		n3.view = View(view, n3.rect);
		n4.view = View(view, n4.rect);
		n5.view = View(view, n5.rect);
		n6.view = View(view, n6.rect);
		n7.view = View(view, n7.rect);

		n1.view.mouseUpAction_({
			if(n1.envBool == true){
				n0.sustainBool = false;
				n2.sustainBool = false;
				n3.sustainBool = false;
				n4.sustainBool = false;
				n5.sustainBool = false;
				n6.sustainBool = false;
				n7.sustainBool = false;
				n8.sustainBool = false;
				n1.sustainBool = n1.sustainBool.not;
				if(n1.sustainBool != true){
					n2.sustainBool = true;
				};
			};
			nodeSynthClass.makeSynth;
			view.refresh;
		});

		n2.view.mouseUpAction_({
			if(n2.envBool == true){
				n0.sustainBool = false;
				n1.sustainBool = false;
				n3.sustainBool = false;
				n4.sustainBool = false;
				n5.sustainBool = false;
				n6.sustainBool = false;
				n7.sustainBool = false;
				n8.sustainBool = false;
				n2.sustainBool = n2.sustainBool.not;
				if(n2.sustainBool != true){
					n1.sustainBool = true;
				};
			};
			nodeSynthClass.makeSynth;
			view.refresh;
		});

		n3.view.mouseUpAction_({
			if(n3.envBool == true){
				n0.sustainBool = false;
				n1.sustainBool = false;
				n2.sustainBool = false;
				n4.sustainBool = false;
				n5.sustainBool = false;
				n6.sustainBool = false;
				n7.sustainBool = false;
				n8.sustainBool = false;
				n3.sustainBool = n3.sustainBool.not;
				if(n3.sustainBool != true){
					n1.sustainBool = true;
				};
			};
			nodeSynthClass.makeSynth;
			view.refresh;
		});

		n4.view.mouseUpAction_({
			if(n4.envBool == true){
				n0.sustainBool = false;
				n1.sustainBool = false;
				n2.sustainBool = false;
				n3.sustainBool = false;
				n5.sustainBool = false;
				n6.sustainBool = false;
				n7.sustainBool = false;
				n8.sustainBool = false;
				n4.sustainBool = n4.sustainBool.not;
				if(n4.sustainBool != true){
					n1.sustainBool = true;
				};
			};
			nodeSynthClass.makeSynth;
			view.refresh;
		});

		n5.view.mouseUpAction_({
			if(n5.envBool == true){
				n0.sustainBool = false;
				n1.sustainBool = false;
				n2.sustainBool = false;
				n3.sustainBool = false;
				n4.sustainBool = false;
				n6.sustainBool = false;
				n7.sustainBool = false;
				n8.sustainBool = false;
				n5.sustainBool = n5.sustainBool.not;
				if(n5.sustainBool != true){
					n1.sustainBool = true;
				};
			};
			nodeSynthClass.makeSynth;
			view.refresh;
		});

		n6.view.mouseUpAction_({
			if(n6.envBool == true){
				n0.sustainBool = false;
				n1.sustainBool = false;
				n2.sustainBool = false;
				n3.sustainBool = false;
				n4.sustainBool = false;
				n5.sustainBool = false;
				n7.sustainBool = false;
				n8.sustainBool = false;
				n6.sustainBool = n6.sustainBool.not;
				if(n6.sustainBool != true){
					n1.sustainBool = true;
				};
			};
			nodeSynthClass.makeSynth;
			view.refresh;
		});

		n7.view.mouseUpAction_({
			if(n7.envBool == true){
				n0.sustainBool = false;
				n1.sustainBool = false;
				n2.sustainBool = false;
				n3.sustainBool = false;
				n4.sustainBool = false;
				n5.sustainBool = false;
				n6.sustainBool = false;
				n8.sustainBool = false;
				n7.sustainBool = n7.sustainBool.not;
				if(n7.sustainBool != true){
					n1.sustainBool = true;
				};
			};
			nodeSynthClass.makeSynth;
			view.refresh;
		});



		n1.view.mouseMoveAction_({
			arg view, x, y;
			n1.x = x + n1.x - 5;
			if(n1.x <= 0){
				n1.x = 0.00001;
			};
			if(n1.x >= 200){
				n1.x = 199.9999;
			};
			n1.y = y + n1.y - 5;
			if(n1.y <= 0){
				n1.y = 0.00001;
			};
			if(n1.y >= 150){
				n1.y = 149.9999;
			};
			n1.rect = Rect(n1.x - 5, n1.y - 5, 10, 10);
			n1.view.bounds = Rect(n1.x - 5, n1.y - 5, 10, 10);
			//nodeSynthClass.makeSynth;
			parent.refresh;

		});

		n2.view.mouseMoveAction_({
			arg view, x, y;

			n2.x = x + n2.x - 5;
			if(n2.x <= 0){
				n2.x = 0.00001;
			};
			if(n2.x >= 200){
				n2.x = 199.9999;
			};
			n2.y = y + n2.y - 5;
			if(n2.y <= 0){
				n2.y = 0.00001;
			};
			if(n2.y >= 150){
				n2.y = 149.9999;
			};
			n2.rect = Rect(n2.x, n2.y, 10, 10);
			n2.view.bounds = Rect(n2.x - 5, n2.y - 5, 10, 10);
			parent.refresh;
			//nodeSynthClass.makeSynth;
		});

		n3.view.mouseMoveAction_({
			arg view, x, y;
			n3.x = x + n3.x - 5;
			if(n3.x <= 0){
				n3.x = 0.00001;
			};
			if(n3.x >= 200){
				n3.x = 199.9999;
			};
			n3.y = y + n3.y - 5;
			if(n3.y <= 0){
				n3.y = 0.00001;
			};
			if(n3.y >= 150){
				n3.y = 149.9999;
			};
			n3.rect = Rect(n3.x, n3.y, 10, 10);
			n3.view.bounds = Rect(n3.x - 5, n3.y - 5, 10, 10);
			parent.refresh;
			//nodeSynthClass.makeSynth;
		});

		n4.view.mouseMoveAction_({
			arg view, x, y;
			n4.x = x + n4.x - 5;
			if(n4.x <= 0){
				n4.x = 0.00001;
			};
			if(n4.x >= 200){
				n4.x = 199.9999;
			};
			n4.y = y + n4.y - 5;
			if(n4.y <= 0){
				n4.y = 0.00001;
			};
			if(n4.y >= 150){
				n4.y = 149.9999;
			};
			n4.rect = Rect(n4.x, n4.y, 10, 10);
			n4.view.bounds = Rect(n4.x - 5, n4.y - 5, 10, 10);
			parent.refresh;
			//nodeSynthClass.makeSynth;
		});

		n5.view.mouseMoveAction_({
			arg view, x, y;
			n5.x = x + n5.x - 5;
			if(n5.x <= 0){
				n5.x = 0.00001;
			};
			if(n5.x >= 200){
				n5.x = 199.9999;
			};
			n5.y = y + n5.y - 5;
			if(n5.y <= 0){
				n5.y = 0.00001;
			};
			if(n5.y >= 150){
				n5.y = 149.9999;
			};
			n5.rect = Rect(n5.x, n5.y, 10, 10);
			n5.view.bounds = Rect(n5.x - 5, n5.y - 5, 10, 10);
			parent.refresh;
			//nodeSynthClass.makeSynth;
		});

		n6.view.mouseMoveAction_({
			arg view, x, y;
			n6.x = x + n6.x - 5;
			if(n6.x <= 0){
				n6.x = 0.00001;
			};
			if(n6.x >= 200){
				n6.x = 199.9999;
			};
			n6.y = y + n6.y - 5;
			if(n6.y <= 0){
				n6.y = 0.00001;
			};
			if(n6.y >= 150){
				n6.y = 149.9999;
			};
			n6.rect = Rect(n6.x, n6.y, 10, 10);
			n6.view.bounds = Rect(n6.x - 5, n6.y - 5, 10, 10);
			parent.refresh;
			//nodeSynthClass.makeSynth;
		});

		n7.view.mouseMoveAction_({
			arg view, x, y;
			n7.x = x + n7.x - 5;
			if(n7.x <= 0){
				n7.x = 0.00001;
			};
			if(n7.x >= 200){
				n7.x = 199.9999;
			};
			n7.y = y + n7.y - 5;
			if(n7.y <= 0){
				n7.y = 0.00001;
			};
			if(n7.y >= 150){
				n7.y = 149.9999;
			};
			n7.rect = Rect(n7.x, n7.y, 10, 10);
			n7.view.bounds = Rect(n7.x - 5, n7.y - 5, 10, 10);
			parent.refresh;
			//nodeSynthClass.makeSynth;
		});

		^view;
	}

	makeWave {
		var zero, first, sec, thir, four, fif, six, sev, eigh, i, waveSize, oscWidth, oscHeight;

		waveSize =  1024 * 2;
		oscWidth = nodeSynthClass.oscWidth;
		oscHeight = nodeSynthClass.oscHeight;

		i = 0;
		zero = n0.sort;
		first = n0.next;
		sec = first.next;
		thir = sec.next;
		four = thir.next;
		fif = four.next;
		six = fif.next;
		sev = six.next;
		eigh = sev.next;








		wave = Array.fill(waveSize, {
			var num;

			num = sev.y + ((eigh.y - sev.y) *
				((((i / waveSize) * oscWidth) - sev.x) / (oscWidth - sev.x)));

			if(i <= ((sev.x/oscWidth) * waveSize)){
				num = six.y + ((sev.y - six.y) *
					((((i / waveSize) * oscWidth) - six.x) / (sev.x - six.x)));
			};

			if(i <= ((six.x/oscWidth) * waveSize)){
				num = fif.y + ((six.y - fif.y) *
					((((i / waveSize) * oscWidth) - fif.x) / (six.x - fif.x)));
			};

			if(i <= ((fif.x/oscWidth) * waveSize)){
				num = four.y + ((fif.y - four.y) *
					((((i / waveSize) * oscWidth) - four.x) / (fif.x - four.x)));
			};

			if(i <= ((four.x/oscWidth) * waveSize)){
				num = thir.y + ((four.y - thir.y) *
					((((i / waveSize) * oscWidth) - thir.x) / (four.x - thir.x)));
			};

			if(i <= ((thir.x/oscWidth) * waveSize)){
				num = sec.y + ((thir.y - sec.y) *
					((((i / waveSize) * oscWidth) - sec.x) / (thir.x - sec.x)));
			};


			if(i <= ((sec.x/oscWidth) * waveSize)){
				num = first.y + ((sec.y - first.y) *
					((((i / waveSize) * oscWidth) - first.x) / (sec.x - first.x)));
			};


			if(i <= ((first.x/oscWidth) * waveSize)){
				num = zero.y + ((first.y - zero.y) *
					((((i / waveSize) * oscWidth) - zero.x) / (first.x - zero.x)));
			};


			num = num - (oscHeight/2);
			num = num * 0.013333;
			num = num * 0.125 * 0.25;
			num = num.neg;


			i = i + 1;
			num;

		});








		^wave;

	}



}

NodeSynthFilter {

	var <>filter, <>cutoff, <>resonance, <>parent, <>nodeSynthClass, <>node;

	*new {
		^super.new;
	}

	makeFilter {
		arg par, x, y, width, height;
		parent = par;
		filter = UserView(par, Rect(x, y, width, height)).background_(Color.white);
		filter.drawFunc_({
			Pen.addOval(node.view.bounds);
			Pen.stroke;
		});

		node.rect = Rect(node.x - 5, node.y - 5, 10, 10);
		node.view = View(filter, node.rect);

		node.view.mouseMoveAction_({
			arg v, x, y;
			node.x = x + node.x - 5;
			if(node.x <= 0){
				node.x = 0.00001;
			};
			if(node.x >= 200){
				node.x = 199.9999;
			};
			node.y = y + node.y - 5;
			if(node.y <= 0){
				node.y = 0.00001;
			};
			if(node.y >= 150){
				node.y = 149.9999;
			};
			node.rect = Rect(node.x, node.y, 10, 10);
			node.view.bounds = Rect(node.x - 5, node.y - 5, 10, 10);
			parent.refresh;

		});
	}
}




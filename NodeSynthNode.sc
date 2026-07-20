

NodeSynthNode {
	var <>x = 0, <>y = 0, <>next = nil, <>view, <>rect, <>nodeSynthClass, <>envBool = false, <>sustainBool = false;

	*new {
		^super.new;
	}

	atIndex {
		arg index;
		var head, i = 0;
		head = this;
		while {i < index} {
			head = head.next;
			i = i + 1;
		};

		^head;
	}

	indexOfMid {
		var fast, slow, i = 0;
		fast = this;
		slow = this;
		while {fast != nil} {
			slow = slow.next;
			fast = fast.next.next;
			i = i + 1;
			if(fast.next == nil){
				^i;
			};
		};

		^i;
	}

	midPoint {
		var fast, slow, i = 0;
		fast = this;
		slow = this;
		while {fast != nil} {
			slow = slow.next;
			fast = fast.next.next;
			if(fast.next == nil){
				^slow;
			};
		};

		^slow;
	}

	size {
		var head, i = 1;
		head = this;
		while {head.next != nil}{
			head = head.next;
			i = i + 1;
		}

		^i;
	}

	sort {
		var head, l, r;

		head = this;
		if((head == nil)||(head.next == nil)){
			^head;
		};

		l = head;
		r = head.midPoint;
		l.atIndex(l.indexOfMid - 1).next = nil;


		^this.merge(l.sort, r.sort);
	}

	merge {
		arg left, right;
		var l, r, ret, sorted;

		l = left;
		r = right;
		sorted = NodeSynthNode.new;
		ret = sorted;

		if(l == nil){
			^r;
		};

		if(r == nil){
			^l;
		};

		while{(l != nil) && (r != nil)} {
			if(l.x < r.x){
				sorted.next = l;
				sorted = sorted.next;
				l = l.next;
			}{
				sorted.next = r;
				sorted = sorted.next;
				r = r.next;
			};

		};

		while{l != nil} {
			sorted.next = l;
			sorted = sorted.next;
			l = l.next;
		};

		while{r != nil} {
			sorted.next = r;
			sorted = sorted.next;
			r = r.next;
		};


		ret = ret.next;

		^ret;


	}
}

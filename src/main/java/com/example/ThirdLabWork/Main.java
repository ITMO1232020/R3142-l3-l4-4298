package com.example.ThirdLabWork;


import com.example.ThirdLabWork.config.Executor;
import com.example.ThirdLabWork.config.SkyMode;
import com.example.ThirdLabWork.viewer.Astronaut;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Astronaut> astronauts = new ArrayList<>();

		astronauts.add(new Astronaut("Незнайка", SkyMode.MoonEclipse));
		astronauts.add(new Astronaut("Спутник 1", SkyMode.MoonDay));
		astronauts.add(new Astronaut("Спутник 2", SkyMode.MoonNightDirectLight));
		astronauts.add(new Astronaut("Спутник 2", SkyMode.MoonNightObliqueLight));
		astronauts.add(new Astronaut("Спутник 3", SkyMode.Space));
		astronauts.add(new Astronaut("Спутник 4", SkyMode.Space));
		astronauts.add(new Astronaut("Спутник 5", SkyMode.Space));

		Executor executor = new Executor(astronauts);
		executor.execute();
	}
}

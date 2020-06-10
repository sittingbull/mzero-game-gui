# Claby

A simple game of eating fruits in a maze and avoiding enemies, with 6 levels to clear. The game can be played :
- by humans in a browser (**Lapyrinthe**);
- by computers using CLI (**AI game**).

## Overview

### Requirements ###
- Clojure & clojurescript
- Leiningen (who will take care of installing all other reqs)
For more info on requirements / dependencies and which version of what you need to install, see `project.clj`

### Use ###
- Install by cloning this rep.

#### Lapyrinthe ####
- Start game with niceties (sound, rabbits everywhere, animations) with ``lein fig:build-lapy``
- Start game with minimal skin with ``lein fig:build-mini`` (intended for AI Game visualisation)

Move the player with arrow keys, or e - d - s - f keys. Game starts at level 1, and if the player clears all levels 6 you will see the ending.

Cheat codes allow to start directly at a given level, or to slow down the enemies, by adding the query string `?cheatlev=X&tick=Y`

#### AI game ####
WIP

## Development

### Project structure
UX tools and entry points are in ``claby.ux``

Game models and actions are in ``claby.game``

### Use
To get an interactive development environment run:

    lein fig:build-{mini|lapy}

This will auto compile and send all changes to the browser without the
need to reload. After the compilation process is complete, you will
get a Browser Connected REPL. An easy way to try it is:

    (js/alert "Am I connected?")

and you should see an alert in the browser window.

To clean all compiled files:

	lein clean

To create a production build run:

	lein clean
	lein fig:prod


## License

Copyright © 2020 Philippe Rolet

Distributed under the Apache Public License 2.0

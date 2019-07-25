#!/bin/bash
kill `lsof -i -n -P | grep TCP | grep 7779 | grep java | tr -s " " "\n" | sed -n 2p`
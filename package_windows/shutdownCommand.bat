@echo off

    setlocal enableextensions

    set "port=7779"

    for /f "tokens=1,4,5" %%a in (
        'netstat -aon ^| findstr /r /c:"[TU][CD]P[^[]*\[::\]:%port%"'
    ) do if "%%a"=="UDP" (taskkill /F /PID %%b) else (taskkill /f /PID %%c)

    endlocal
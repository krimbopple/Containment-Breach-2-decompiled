Function GUESSEDgetbuild%()
    Local local0$
    local0 = (Str getgraphicslevel())
    seterrormsg($02, "---------------------------------------------------")
    seterrormsg($03, ((("Date and time: " + currentdate()) + ", ") + currenttime()))
    seterrormsg($04, (((((("OS: " + systemproperty("os")) + " ") + (Str (((getenv("ProgramFiles(X86)") <> "0") Shl $05) + $20))) + " Bit (Build: ") + systemproperty("osbuild")) + ")"))
    seterrormsg($05, (((((("CPU: " + trim(systemproperty("cpuname"))) + " (Arch: ") + systemproperty("cpuarch")) + ", ") + getenv("NUMBER_OF_PROCESSORS")) + " Threads)"))
    seterrormsg($0A, ((((((((("Game build: 44 (" + GUESSEDupdateentry($20105)) + "). Engine build: ") + systemproperty("blitzbuild")) + " (") + systemproperty("blitzversion")) + "). DirectX Version: ") + left(local0, (len(local0) - $01))) + ".") + mid(local0, len(local0), $01)))
    errormessageinitialized = $01
    Return $00
End Function

Function GUESSEDmenureport%(arg0.TX2BF6X0FF4)
    GUESSEDresetresetinput((((getlocalstring("mpmenu", "report.reason") + " (") + arg0\Field27) + ")"), ((((((((getlocalstring("mpmenu", "report.cheats") + "\n") + getlocalstring("mpmenu", "report.grief")) + "\n") + getlocalstring("mpmenu", "report.teamkill")) + "\n") + getlocalstring("mpmenu", "report.ruins")) + "\n") + getlocalstring("mpmenu", "report.voice")), "Report", "Cancel", $01, FuncPtr(FBDDBZ0), $01, $00)
    TX20D8BXZ42[$00] = ((dottedip(GUESSEDinitinitnewgame_8()) + ":") + (Str GUESSEDgetglobal_19()))
    TX20D8BXZ42[$01] = GUESSEDgeteax_0007(T8X2046020\Field6)
    TX20D8BXZ42[$02] = arg0\Field21\Field3
    TX20D8BXZ42[$03] = arg0\Field27
    Return $00
End Function

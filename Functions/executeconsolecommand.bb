Function executeconsolecommand%(arg0$, arg1%)
    Local local0$
    Local local1%
    Local local2.events
    Local local3.events
    Local local4.rooms
    Local local5.items
    Local local6.npcs
    Local local7%
    Local local8.itemtemplates
    Local local9.roomtemplates
    Local local10%
    Local local11%
    Local local12%
    Local local13%
    Local local14$
    Local local15$
    Local local16$
    Local local17$
    Local local18$
    Local local21.TX2BF6X0FF4
    Local local22%
    Local local23%
    Local local24%
    Local local25#
    Local local36%
    Local local37%
    Local local38%
    Local local39$
    Local local40%
    Local local42%
    Local local43%
    Local local44%
    Local local45%
    Local local46%
    Local local47%
    local0 = consoleinput
    consoleinput = arg0
    If (instr(consoleinput, " ", $01) <> $00) Then
        local15 = lower(left(consoleinput, (instr(consoleinput, " ", $01) - $01)))
    Else
        local15 = lower(consoleinput)
    EndIf
    Select lower(local15)
        Case "help"
            If (instr(consoleinput, " ", $01) <> $00) Then
                local15 = lower(right(consoleinput, (len(consoleinput) - instr(consoleinput, " ", $01))))
            Else
                local15 = ""
            EndIf
            consoler = $00
            consoleg = $FF
            consoleb = $FF
            Select local15
                Case "1",""
                    createconsolemsg(getlocalstring("console", "help_1.1"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- teleport [room name]", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- roomlist", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- spawnitem [item name / ID]", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- spawndrink [drink name]", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- itemlist", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- ending [ID]", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- notarget", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- godmode", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- noclip", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- noclipspeed", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- infinitestamina", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- noblink", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- asd", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- revive", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- heal", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- money", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- debughud [category]", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- codes", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg(getlocalstring("console", "help_1.2"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg(getlocalstring("console", "help.command"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "2"
                    createconsolemsg(getlocalstring("console", "help_2.1"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- reset096", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- reset372", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- 106retreat", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- disable173", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- enable173", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- disable106", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- enable106", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- disable049", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- enable049", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- disable066", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- enable066", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- disable096", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- enable096", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- disable513-1", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- enable513-1", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- disable966", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- enable966", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- doorcontrol", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- unlockcheckpoints", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- unlockexits", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- disablenuke", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- resetfunds", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg(getlocalstring("console", "help_2.2"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg(getlocalstring("console", "help.command"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "3"
                    createconsolemsg(getlocalstring("console", "help_3.1"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- camerafog [x]", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- npclist", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- spawn [npc type] [state]", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- injure [value]", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- blur [value]", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- infect [value]", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- crystal [value]", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- ice [value]", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- giveachievement [ID / All]", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- wireframe", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- halloween", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- newyear", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- sanic", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("- weed", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg(getlocalstring("console", "help.command"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "camerafog"
                    createconsolemsg(format(getlocalstring("console", "help.title"), "camerafog", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemultimsg(getlocalstring("console", "help.camerafog"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "noclip","fly"
                    createconsolemsg(format(getlocalstring("console", "help.title"), "noclip", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemultimsg(getlocalstring("console", "help.noclip"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "noblink","nb"
                    createconsolemsg(format(getlocalstring("console", "help.title"), "noblink", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemultimsg(getlocalstring("console", "help.noblink"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "godmode","god"
                    createconsolemsg(format(getlocalstring("console", "help.title"), "god", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemultimsg(getlocalstring("console", "help.god"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "infinitestamina","is"
                    createconsolemsg(format(getlocalstring("console", "help.title"), "infinitestamina", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemultimsg(getlocalstring("console", "help.is"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "notarget","nt"
                    createconsolemsg(format(getlocalstring("console", "help.title"), "notarget", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemultimsg(getlocalstring("console", "help.nt"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "wireframe","wf"
                    createconsolemsg(format(getlocalstring("console", "help.title"), "wireframe", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemultimsg(getlocalstring("console", "help.wf"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "spawnitem","si","giveitem"
                    createconsolemsg(format(getlocalstring("console", "help.title"), "spawnitem", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemultimsg(getlocalstring("console", "help.si"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "spawncup","givecup","spawndrink","givedrink"
                    createconsolemsg(format(getlocalstring("console", "help.title"), "spawndrink", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemultimsg(getlocalstring("console", "help.sd"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "spawn","s"
                    createconsolemsg(format(getlocalstring("console", "help.title"), "spawn", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemultimsg(getlocalstring("console", "help.s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "reset372"
                    createconsolemsg(format(getlocalstring("console", "help.title"), "reset372", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemultimsg(getlocalstring("console", "help.r372"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "106retreat"
                    createconsolemsg(format(getlocalstring("console", "help.title"), "106retreat", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemultimsg(getlocalstring("console", "help.106r"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "disable049"
                    createconsolemsg(format(getlocalstring("console", "help.title"), "disable049", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemultimsg(format(getlocalstring("console", "help.SCP.dis"), "SCP-049", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "enable049"
                    createconsolemsg(format(getlocalstring("console", "help.title"), "enable049", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemultimsg(format(getlocalstring("console", "help.SCP.en"), "SCP-049", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "disable066"
                    createconsolemsg(format(getlocalstring("console", "help.title"), "disable066", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemultimsg(format(getlocalstring("console", "help.SCP.dis"), "SCP-066", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "enable066"
                    createconsolemsg(format(getlocalstring("console", "help.title"), "enable066", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemultimsg(format(getlocalstring("console", "help.SCP.en"), "SCP-066", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "disable096"
                    createconsolemsg(format(getlocalstring("console", "help.title"), "disable096", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemultimsg(format(getlocalstring("console", "help.SCP.dis"), "SCP-096", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "enable096"
                    createconsolemsg(format(getlocalstring("console", "help.title"), "enable096", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemultimsg(format(getlocalstring("console", "help.SCP.en"), "SCP-096", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "reset096"
                    createconsolemsg(format(getlocalstring("console", "help.title"), "reset096", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemultimsg(getlocalstring("console", "help.r096"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "disable106"
                    createconsolemsg(format(getlocalstring("console", "help.title"), "disable106", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemultimsg(format(getlocalstring("console", "help.SCP.dis"), "SCP-106", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "enable106"
                    createconsolemsg(format(getlocalstring("console", "help.title"), "enable106", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemultimsg(format(getlocalstring("console", "help.SCP.en"), "SCP-106", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "disable173"
                    createconsolemsg(format(getlocalstring("console", "help.title"), "disable173", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemultimsg(format(getlocalstring("console", "help.SCP.dis"), "SCP-173", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "enable173"
                    createconsolemsg(format(getlocalstring("console", "help.title"), "enable173", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemultimsg(format(getlocalstring("console", "help.SCP.en"), "SCP-173", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "disable513-1"
                    createconsolemsg(format(getlocalstring("console", "help.title"), "disable513-1", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemultimsg(format(getlocalstring("console", "help.SCP.dis"), "SCP-513-1", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "enable513-1"
                    createconsolemsg(format(getlocalstring("console", "help.title"), "enable513-1", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemultimsg(format(getlocalstring("console", "help.SCP.en"), "SCP-513-1", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "disable966"
                    createconsolemsg(format(getlocalstring("console", "help.title"), "disable966", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemultimsg(format(getlocalstring("console", "help.SCP.dis"), "SCP-966", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "enable966"
                    createconsolemsg(format(getlocalstring("console", "help.title"), "enable966", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemultimsg(format(getlocalstring("console", "help.SCP.en"), "SCP-966", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "doorcontrol"
                    createconsolemsg(format(getlocalstring("console", "help.title"), "doorcontrol", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemultimsg(getlocalstring("console", "help.dc"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "asd"
                    createconsolemsg(format(getlocalstring("console", "help.title"), "asd", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemultimsg(getlocalstring("console", "help.asd"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "unlockcheckpoints"
                    createconsolemsg(format(getlocalstring("console", "help.title"), "unlockcheckpoints", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemultimsg(getlocalstring("console", "help.uc"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "revive","undead","resurrect"
                    createconsolemsg(format(getlocalstring("console", "help.title"), "revive", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemultimsg(getlocalstring("console", "help.revive"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "teleport"
                    createconsolemsg(format(getlocalstring("console", "help.title"), "teleport", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemultimsg(getlocalstring("console", "help.teleport"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "stopsound","stfu"
                    createconsolemsg(format(getlocalstring("console", "help.title"), "stopsound", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemultimsg(getlocalstring("console", "help.stfu"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "weed","scp-420-j","420j","scp420-j","scp-420j","420"
                    createconsolemsg(format(getlocalstring("console", "help.title"), "weed", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemultimsg(getlocalstring("console", "help.weed"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "infect"
                    createconsolemsg(format(getlocalstring("console", "help.title"), "infect", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemultimsg(getlocalstring("console", "help.infect"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "crystal"
                    createconsolemsg(format(getlocalstring("console", "help.title"), "crystal", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemultimsg(getlocalstring("console", "help.crystal"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "ice"
                    createconsolemsg(format(getlocalstring("console", "help.title"), "ice", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemultimsg(getlocalstring("console", "help.ice"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "resetfunds"
                    createconsolemsg(format(getlocalstring("console", "help.title"), "resetfunds", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemultimsg(getlocalstring("console", "help.rf"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "giveachievement"
                    createconsolemsg(format(getlocalstring("console", "help.title"), "giveachievement", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemultimsg(getlocalstring("console", "help.ac"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "codes"
                    createconsolemsg(format(getlocalstring("console", "help.title"), "codes", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemultimsg(getlocalstring("console", "help.codes"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg("******************************", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Default
                    createconsolemsg(getlocalstring("console", "help.no"), $FF, $96, $00, $00)
            End Select
        Case "ending"
            local15 = lower(right(consoleinput, (len(consoleinput) - instr(consoleinput, " ", $01))))
            XZ0260X8X2\Field40 = (Int clamp((Float (Int local15)), 0.0, 3.0))
            XZ0260X8X2\Field48 = 1.0
        Case "noclipspeed"
            local15 = lower(right(consoleinput, (len(consoleinput) - instr(consoleinput, " ", $01))))
            chs\Field5 = (Float local15)
            createconsolemsg(format(getlocalstring("console", "fly.speed"), local15, "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "injure"
            local15 = lower(right(consoleinput, (len(consoleinput) - instr(consoleinput, " ", $01))))
            XZ0260X8X2\Field11 = (Float local15)
            createconsolemsg(format(getlocalstring("console", "inj"), local15, "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "cls","clear"
            clearconsole()
        Case "infect"
            local15 = lower(right(consoleinput, (len(consoleinput) - instr(consoleinput, " ", $01))))
            i_008\Field0 = (Float local15)
            createconsolemsg(format(getlocalstring("console", "008"), local15, "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "crystal"
            local15 = lower(right(consoleinput, (len(consoleinput) - instr(consoleinput, " ", $01))))
            i_409\Field0 = (Float local15)
            createconsolemsg(format(getlocalstring("console", "409"), local15, "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "ice"
            local15 = lower(right(consoleinput, (len(consoleinput) - instr(consoleinput, " ", $01))))
            i_009\Field0 = (Float local15)
            createconsolemsg(format(getlocalstring("console", "009"), local15, "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "heal"
            resetnegativestats($00)
            createconsolemsg(getlocalstring("console", "heal"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "teleport","tp"
            local15 = lower(right(consoleinput, (len(consoleinput) - instr(consoleinput, " ", $01))))
            local12 = $00
            local13 = findroomid(local15)
            For local4 = Each rooms
                If (((local4\Field22\Field21 = local13) Lor ((Str local4\Field22\Field21) = local15)) <> 0) Then
                    local12 = $01
                    If (local4\Field35 <> $00) Then
                        teleportentity(XZ0260X8X2\Field74, entityx(local4\Field35, $01, 1.0), (entityy(local4\Field15, $00, 1.0) + 0.5), entityz(local4\Field35, $01, 1.0), 0.3, $01, 2.0, $00)
                    Else
                        teleportentity(XZ0260X8X2\Field74, entityx(local4\Field15, $00, 1.0), (entityy(local4\Field15, $00, 1.0) + 0.5), entityz(local4\Field15, $00, 1.0), 0.3, $00, 2.0, $00)
                    EndIf
                    teleporttoroom(local4)
                    createconsolemsg(format(getlocalstring("console", "tp.success"), local15, "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    Exit
                EndIf
            Next
            If (local12 = $00) Then
                createconsolemsg(getlocalstring("console", "tp.failed"), $FF, $00, $00, $00)
            EndIf
        Case "tpp"
            local15 = lower(right(consoleinput, (len(consoleinput) - instr(consoleinput, " ", $01))))
            local12 = $00
            For local21 = Each TX2BF6X0FF4
                If (instr(lower(local21\Field27), local15, $01) <> 0) Then
                    positionentity(XZ0260X8X2\Field74, local21\Field19, local21\Field49, local21\Field26, $00)
                    resetentity(XZ0260X8X2\Field74)
                    If (XXDB6F64F2[local21\Field3] <> Null) Then
                        playerroom = XXDB6F64F2[local21\Field3]
                    EndIf
                    local12 = $01
                EndIf
            Next
            If (local12 = $00) Then
                createconsolemsg(getlocalstring("console", "tpp.failed"), $FF, $00, $00, $00)
            EndIf
        Case "roomlist","roomslist","rooms","room list"
            createconsolemsg("--------------------------------", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
            For local9 = Each roomtemplates
                createconsolemsg(((("ID: " + (Str local9\Field21)) + "; Name: ") + local9\Field12), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
            Next
            createconsolemsg("--------------------------------", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "spawnitem","si","giveitem","gi"
            local15 = lower(right(consoleinput, (len(consoleinput) - instr(consoleinput, " ", $01))))
            local12 = $00
            For local8 = Each itemtemplates
                If ((((lower(local8\Field19) = local15) Lor (lower(local8\Field24) = local15)) Lor ((Str local8\Field9) = local15)) <> 0) Then
                    If (((X4BX024DX0() = $00) Lor TXB2BFFFFFX()) <> 0) Then
                        local5 = createitem(local8\Field19, local8\Field9, entityx(XZ0260X8X2\Field74, $00, 1.0), entityy(camera, $01, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), $00, $00, $00, 1.0, $00)
                        entitytype(local5\Field9, $03, $00)
                    EndIf
                    createconsolemsg(format(getlocalstring("console", "si.success"), local8\Field24, "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    local12 = $01
                    Exit
                EndIf
            Next
            If (local12 = $00) Then
                createconsolemsg(getlocalstring("console", "si.failed"), $FF, $00, $00, $00)
            EndIf
        Case "spawncup","givecup","spawndrink","givedrink"
            local15 = upper(right(consoleinput, (len(consoleinput) - instr(consoleinput, " ", $01))))
            local12 = $00
            If (TX6ZD06226X(i_294\Field3, local15) <> 0) Then
                local22 = D8XX4X0D0(i_294\Field0, XF2FX4F0X2(i_294\Field3, local15))
                local23 = $00
                local23 = TX0Z2Z4F86D(local22, "explosion")
                If (TF46ZF6DB6(local23) = $00) Then
                    If (TX8B6FFF244(local23) <> 0) Then
                        XZ0260X8X2\Field33 = 135.0
                        local23 = TX0Z2Z4F86D(local22, "death_message")
                        If (TF46ZF6DB6(local23) = $00) Then
                            msg\Field8 = TX240XXB6Z6(local23)
                        EndIf
                    EndIf
                EndIf
                local24 = TD4644B68Z(TX0Z2Z4F86D(local22, "color"))
                local25 = T4BFX842B(TX0Z2Z4F86D(local22, "alpha"))
                local23 = TX0Z2Z4F86D(local22, "glow")
                If (TF46ZF6DB6(local23) = $00) Then
                    If (TX8B6FFF244(local23) <> 0) Then
                        local25 = (- local25)
                    EndIf
                EndIf
                local5 = createitem("Cup", $2B, entityx(XZ0260X8X2\Field74, $00, 1.0), entityy(camera, $01, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), XB2460ZF4(D8XX4X0D0(local24, $00)), XB2460ZF4(D8XX4X0D0(local24, $01)), XB2460ZF4(D8XX4X0D0(local24, $02)), local25, $00)
                local5\Field19 = local15
                local5\Field24 = format(getlocalstring("items", "cupof"), local15, "%s")
                entitytype(local5\Field9, $03, $00)
                createconsolemsg(format(getlocalstring("console", "si.success"), local5\Field24, "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                local12 = $01
            EndIf
            If (local12 = $00) Then
                createconsolemsg(getlocalstring("console", "si.failed"), $FF, $00, $00, $00)
            EndIf
        Case "itemlist","itemslist","items","item list"
            createconsolemsg("--------------------------------", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
            For local8 = Each itemtemplates
                createconsolemsg(format(format(format(getlocalstring("console", "itemlist"), (Str local8\Field9), "{0}"), local8\Field19, "{1}"), local8\Field24, "{2}"), $FF, $96, $00, $00)
            Next
            createconsolemsg("--------------------------------", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "wireframe","wf"
            local15 = lower(right(consoleinput, (len(consoleinput) - instr(consoleinput, " ", $01))))
            Select local15
                Case "on","1","true"
                    wireframestate = $01
                Case "off","0","false"
                    wireframestate = $00
                Default
                    wireframestate = (wireframestate = $00)
            End Select
            If (wireframestate <> 0) Then
                createconsolemsg(getlocalstring("console", "wf.on"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
            Else
                createconsolemsg(getlocalstring("console", "wf.off"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
            EndIf
            wireframe(wireframestate)
        Case "disable049","dis049"
            For local6 = Each npcs
                If (local6\Field77 = $03) Then
                    local6\Field31 = 1.0
                    positionentity(local6\Field82, 0.0, -500.0, 0.0, $00)
                    resetentity(local6\Field82)
                    hideentity(local6\Field98)
                    hideentity(local6\Field82)
                EndIf
            Next
            createconsolemsg(format(getlocalstring("console", "SCP.dis"), "SCP-049", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "enable049","en049"
            For local6 = Each npcs
                If (local6\Field77 = $03) Then
                    local6\Field31 = 0.0
                    showentity(local6\Field98)
                    showentity(local6\Field82)
                EndIf
            Next
            createconsolemsg(format(getlocalstring("console", "SCP.en"), "SCP-049", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "disable066","dis066"
            For local6 = Each npcs
                If (local6\Field77 = $05) Then
                    local6\Field31 = 1.0
                    hideentity(local6\Field98)
                    hideentity(local6\Field82)
                EndIf
            Next
            createconsolemsg(format(getlocalstring("console", "SCP.dis"), "SCP-066", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "enable066","en066"
            For local6 = Each npcs
                If (local6\Field77 = $05) Then
                    local6\Field31 = 0.0
                    showentity(local6\Field98)
                    showentity(local6\Field82)
                EndIf
            Next
            createconsolemsg(format(getlocalstring("console", "SCP.en"), "SCP-066", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "disable096","dis096"
            For local6 = Each npcs
                If (local6\Field77 = $06) Then
                    local6\Field31 = 1.0
                    hideentity(local6\Field98)
                    hideentity(local6\Field82)
                EndIf
            Next
            createconsolemsg(format(getlocalstring("console", "SCP.dis"), "SCP-096", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "enable096","en096"
            For local6 = Each npcs
                If (local6\Field77 = $06) Then
                    local6\Field31 = 0.0
                    showentity(local6\Field98)
                    showentity(local6\Field82)
                EndIf
            Next
            createconsolemsg(format(getlocalstring("console", "SCP.en"), "SCP-096", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "reset096","r096"
            If (n_i\Field10 <> Null) Then
                n_i\Field10\Field66 = 0.0
                stopstream_strict(n_i\Field10\Field63)
                n_i\Field10\Field63 = $00
                n_i\Field10\Field94 = $00
                If (n_i\Field10\Field6 <> $00) Then
                    stopstream_strict(n_i\Field10\Field6)
                    n_i\Field10\Field6 = $00
                    n_i\Field10\Field88 = $00
                EndIf
                giveachievement("096", $00)
            EndIf
            createconsolemsg(getlocalstring("console", "r096"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "disable106","dis106"
            For local6 = Each npcs
                If (local6\Field77 = $07) Then
                    local6\Field66 = 0.0
                    local6\Field65 = rnd(22000.0, 27000.0)
                    local6\Field93 = $01
                    hideentity(local6\Field82)
                    hideentity(local6\Field98)
                EndIf
            Next
            createconsolemsg(format(getlocalstring("console", "SCP.dis"), "SCP-106", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "enable106","en106"
            For local6 = Each npcs
                If (local6\Field77 = $07) Then
                    local6\Field31 = 0.0
                    local6\Field93 = $00
                    showentity(local6\Field98)
                    showentity(local6\Field82)
                EndIf
            Next
            createconsolemsg(format(getlocalstring("console", "SCP.en"), "SCP-106", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "106retreat","106r","reset106","r106"
            If (1.0 < n_i\Field2\Field66) Then
                n_i\Field2\Field66 = 0.0
                n_i\Field2\Field65 = rnd(22000.0, 27000.0)
                createconsolemsg(getlocalstring("console", "106r"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
            Else
                createconsolemsg(getlocalstring("console", "106r.failed"), $FF, $96, $00, $00)
            EndIf
        Case "disable173","dis173"
            For local6 = Each npcs
                If (local6\Field77 = $08) Then
                    local6\Field31 = 3.0
                    hideentity(local6\Field98)
                    hideentity(local6\Field101)
                    hideentity(local6\Field82)
                EndIf
            Next
            createconsolemsg(format(getlocalstring("console", "SCP.dis"), "SCP-173", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "enable173","en173"
            For local6 = Each npcs
                If (local6\Field77 = $08) Then
                    local6\Field31 = 0.0
                    showentity(local6\Field98)
                    showentity(local6\Field101)
                    showentity(local6\Field82)
                EndIf
            Next
            createconsolemsg(format(getlocalstring("console", "SCP.en"), "SCP-173", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "reset372","r372"
            For local6 = Each npcs
                If (local6\Field77 = $09) Then
                    removenpc(local6)
                    Exit
                EndIf
            Next
            createconsolemsg(getlocalstring("console", "r372"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "disable513-1","dis513-1"
            removenpc(n_i\Field0)
            createconsolemsg(format(getlocalstring("console", "SCP.dis"), "SCP-513", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "enable513-1","en513-1"
            If (n_i\Field0 = Null) Then
                n_i\Field0 = createnpc($0B, 0.0, 0.0, 0.0)
            EndIf
            createconsolemsg(format(getlocalstring("console", "SCP.en"), "SCP-13", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "disable966","dis966"
            For local6 = Each npcs
                If (local6\Field77 = $0E) Then
                    If (66.0 <> local6\Field66) Then
                        local6\Field66 = -1.0
                    EndIf
                    positionentity(local6\Field82, 0.0, -500.0, 0.0, $00)
                    resetentity(local6\Field82)
                    hideentity(local6\Field82)
                    hideentity(local6\Field98)
                EndIf
            Next
            createconsolemsg(format(getlocalstring("console", "SCP.dis"), "SCP-966", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "enable966","en966"
            For local6 = Each npcs
                If (local6\Field77 = $0E) Then
                    If (66.0 <> local6\Field66) Then
                        local6\Field66 = 0.0
                    EndIf
                    showentity(local6\Field82)
                    If (T8660BZ460\Field8 > $00) Then
                        showentity(local6\Field98)
                    EndIf
                EndIf
            Next
            createconsolemsg(format(getlocalstring("console", "SCP.en"), "SCP-966", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "halloween"
            If (n_i\Field3 <> Null) Then
                n_i\Field12 = (n_i\Field12 = $00)
                If (n_i\Field12 <> 0) Then
                    n_i\Field7 = $00
                    n_i\Field5 = $00
                    local10 = loadtexture_strict("GFX\NPCs\scp_173_H.png", $01, $00, 1.0)
                    entitytexture(n_i\Field3\Field98, local10, $00, $00)
                    entitytexture(n_i\Field3\Field101, local10, $00, $00)
                    deletesingletextureentryfromcache(local10, $00)
                    local10 = $00
                    createconsolemsg(getlocalstring("console", "halloween.on"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Else
                    local11 = loadtexture_strict("GFX\NPCs\scp_173.png", $01, $00, 1.0)
                    entitytexture(n_i\Field3\Field98, local11, $00, $00)
                    entitytexture(n_i\Field3\Field101, local11, $00, $00)
                    deletesingletextureentryfromcache(local11, $00)
                    local11 = $00
                    createconsolemsg(getlocalstring("console", "halloween.off"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                EndIf
            EndIf
        Case "newyear"
            If (n_i\Field3 <> Null) Then
                n_i\Field7 = (n_i\Field7 = $00)
                If (n_i\Field7 <> 0) Then
                    n_i\Field12 = $00
                    n_i\Field5 = $00
                    local10 = loadtexture_strict("GFX\NPCs\scp_173_NY.png", $01, $00, 1.0)
                    entitytexture(n_i\Field3\Field98, local10, $00, $00)
                    entitytexture(n_i\Field3\Field101, local10, $00, $00)
                    deletesingletextureentryfromcache(local10, $00)
                    local10 = $00
                    createconsolemsg(getlocalstring("console", "newyear.on"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Else
                    local11 = loadtexture_strict("GFX\NPCs\scp_173.png", $01, $00, 1.0)
                    entitytexture(n_i\Field3\Field98, local11, $00, $00)
                    entitytexture(n_i\Field3\Field101, local11, $00, $00)
                    deletesingletextureentryfromcache(local11, $00)
                    local11 = $00
                    createconsolemsg(getlocalstring("console", "newyear.off"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                EndIf
            EndIf
        Case "joke"
            If (n_i\Field3 <> Null) Then
                n_i\Field5 = (n_i\Field5 = $00)
                If (n_i\Field5 <> 0) Then
                    n_i\Field12 = $00
                    n_i\Field7 = $00
                    local10 = loadtexture_strict("GFX\NPCs\scp_173_J.png", $01, $00, 1.0)
                    entitytexture(n_i\Field3\Field98, local10, $00, $00)
                    entitytexture(n_i\Field3\Field101, local10, $00, $00)
                    deletesingletextureentryfromcache(local10, $00)
                    local10 = $00
                    createconsolemsg(getlocalstring("console", "aprilfools.on"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Else
                    local11 = loadtexture_strict("GFX\NPCs\scp_173.png", $01, $00, 1.0)
                    entitytexture(n_i\Field3\Field98, local11, $00, $00)
                    entitytexture(n_i\Field3\Field101, local11, $00, $00)
                    deletesingletextureentryfromcache(local11, $00)
                    local11 = $00
                    createconsolemsg(getlocalstring("console", "aprilfools.off"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                EndIf
            EndIf
        Case "sanic"
            chs\Field1 = (chs\Field1 = $00)
            If (chs\Field1 <> 0) Then
                createconsolemsg(getlocalstring("console", "sanic.on"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
            Else
                createconsolemsg(getlocalstring("console", "sanic.off"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
            EndIf
        Case "scp-420-j","420","weed","scp420-j","scp-420j","420j"
            For local13 = $01 To $14 Step $01
                If (rand($02, $01) = $01) Then
                    local15 = "Some SCP-420-J"
                    local12 = $0E
                Else
                    local15 = "Joint"
                    local12 = $10
                EndIf
                local5 = createitem(local15, local12, (entityx(XZ0260X8X2\Field74, $01, 1.0) + (cos((18.0 * (Float local13))) * rnd(0.3, 0.5))), entityy(camera, $01, 1.0), (entityz(XZ0260X8X2\Field74, $01, 1.0) + (sin((18.0 * (Float local13))) * rnd(0.3, 0.5))), $00, $00, $00, 1.0, $00)
                entitytype(local5\Field9, $03, $00)
            Next
            playsound_strict(loadtempsound("SFX\Music\Using420J.ogg"), $00, $00)
            X42666Z0B0(Null, "SFX\Music\Using420J.ogg", XZ0260X8X2\Field74, 20.0, 1.0)
        Case "godmode","god"
            local15 = lower(right(consoleinput, (len(consoleinput) - instr(consoleinput, " ", $01))))
            Select local15
                Case "on","1","true"
                    chs\Field0 = $01
                Case "off","0","false"
                    chs\Field0 = $00
                Default
                    chs\Field0 = (chs\Field0 = $00)
            End Select
            If (chs\Field0 <> 0) Then
                createconsolemsg(getlocalstring("console", "god.on"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
            Else
                createconsolemsg(getlocalstring("console", "god.off"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
            EndIf
        Case "revive","undead","resurrect"
            If (X4BX024DX0() <> $00) Then
                YX440XFZX4(TXXF6F02DB2[TXXDZB2ZBXX()])
            EndIf
            resetnegativestats($01)
            If (X2Z260BF0Z\Field1[$0C] <> $00) Then
                freeentity(X2Z260BF0Z\Field1[$0C])
                X2Z260BF0Z\Field1[$0C] = $00
            EndIf
            XZ0260X8X2\Field38 = $02
        Case "noclip","fly"
            local15 = lower(right(consoleinput, (len(consoleinput) - instr(consoleinput, " ", $01))))
            Select local15
                Case "on","1","true"
                    chs\Field7 = $01
                    XZ0260X8X2\Field38 = $02
                Case "off","0","false"
                    chs\Field7 = $00
                    rotateentity(XZ0260X8X2\Field74, 0.0, entityyaw(XZ0260X8X2\Field74, $00, 1.0), 0.0, $00)
                Default
                    chs\Field7 = (chs\Field7 = $00)
                    If (chs\Field7 = $00) Then
                        rotateentity(XZ0260X8X2\Field74, 0.0, entityyaw(XZ0260X8X2\Field74, $00, 1.0), 0.0, $00)
                    Else
                        XZ0260X8X2\Field38 = $02
                    EndIf
            End Select
            If (chs\Field7 <> 0) Then
                createconsolemsg(getlocalstring("console", "fly.on"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
            Else
                createconsolemsg(getlocalstring("console", "fly.off"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
            EndIf
            XZ0260X8X2\Field16 = 0.0
        Case "noblink","nb"
            local15 = lower(right(consoleinput, (len(consoleinput) - instr(consoleinput, " ", $01))))
            Select local15
                Case "on","1","true"
                    chs\Field2 = $01
                Case "off","0","false"
                    chs\Field2 = $00
                Default
                    chs\Field2 = (chs\Field2 = $00)
            End Select
            If (chs\Field2 <> 0) Then
                createconsolemsg(getlocalstring("console", "nb.on"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
            Else
                createconsolemsg(getlocalstring("console", "nb.off"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
            EndIf
        Case "debughud","dbh"
            If (instr(consoleinput, " ", $01) <> $00) Then
                local15 = lower(right(consoleinput, (len(consoleinput) - instr(consoleinput, " ", $01))))
            Else
                local15 = ""
            EndIf
            Select local15
                Case "game","1"
                    chs\Field4 = $01
                Case "player","me","2"
                    chs\Field4 = $02
                Case "scps","scp","3"
                    chs\Field4 = $03
                Case "mp","multiplayer","4"
                    chs\Field4 = $04
                Case "off","false","0"
                    chs\Field4 = $00
                Default
                    createconsolemsg(getlocalstring("console", "debug.cate"), $FF, $96, $00, $00)
            End Select
        Case "stopsound","stfu"
            killsounds($01)
            For local2 = Each events
                If (local2\Field32 = $03) Then
                    For local13 = $00 To $02 Step $01
                        If (local2\Field19\Field32[local13] <> Null) Then
                            removenpc(local2\Field19\Field32[local13])
                        EndIf
                        If (local13 < $02) Then
                            If (local2\Field19\Field27[local13] <> $00) Then
                                translateentity(local2\Field19\Field27[local13], 0.0, -1000.0, 0.0, $01)
                            EndIf
                        EndIf
                    Next
                    If (local2\Field19\Field32[$07] <> Null) Then
                        local2\Field19\Field32[$07]\Field57 = 2.0
                        local2\Field19\Field32[$07]\Field1 = $01
                    EndIf
                    If (n_i\Field3 <> Null) Then
                        If (1.0 = n_i\Field3\Field31) Then
                            n_i\Field3\Field31 = 0.0
                        EndIf
                        positionentity(n_i\Field3\Field82, 0.0, -500.0, 0.0, $00)
                        resetentity(n_i\Field3\Field82)
                    EndIf
                    positionentity(local2\Field19\Field27[$02], entityx(local2\Field19\Field27[$02], $01, 1.0), (local2\Field19\Field3 + 1.5), entityz(local2\Field19\Field27[$02], $01, 1.0), $01)
                    rotateentity(local2\Field19\Field27[$02], entitypitch(local2\Field19\Field27[$02], $01, 1.0), entityyaw(local2\Field19\Field27[$02], $01, 1.0), entityroll(local2\Field19\Field27[$02], $01, 1.0), $01)
                    removeevent(local2)
                    Exit
                EndIf
            Next
            createconsolemsg(getlocalstring("console", "stfu"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "camerafog","cf"
            local15 = lower(right(consoleinput, (len(consoleinput) - instr(consoleinput, " ", $01))))
            If (opt\Field30 = $01) Then
                fog\Field0 = (Float local15)
            Else
                fog\Field0 = clamp((Float local15), -100.0, 100000.0)
            EndIf
            createconsolemsg(format(getlocalstring("console", "fog"), (Str fog\Field0), "{0}"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "ambient"
            fog\Field6 = lower(right(consoleinput, (len(consoleinput) - instr(consoleinput, " ", $01))))
            createconsolemsg("Done", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "zoneambient"
            fog\Field14 = lower(right(consoleinput, (len(consoleinput) - instr(consoleinput, " ", $01))))
            createconsolemsg("Done", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "zonelighting"
            local15 = lower(right(consoleinput, (len(consoleinput) - instr(consoleinput, " ", $01))))
            fog\Field1 = (Float local15)
            createconsolemsg("Done", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "shake"
            XZ0260X8X2\Field1 = (Float lower(right(consoleinput, (len(consoleinput) - instr(consoleinput, " ", $01)))))
            createconsolemsg("Done", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "npclist","npcslist","npc list","npcs list","npcs"
            createconsolemsg("--------------------------------", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
            createconsolemsg("008-1", $FF, $96, $00, $00)
            createconsolemsg("049", $FF, $96, $00, $00)
            createconsolemsg("049-2", $FF, $96, $00, $00)
            createconsolemsg("066", $FF, $96, $00, $00)
            createconsolemsg("096", $FF, $96, $00, $00)
            createconsolemsg("106", $FF, $96, $00, $00)
            createconsolemsg("173", $FF, $96, $00, $00)
            createconsolemsg("372", $FF, $96, $00, $00)
            createconsolemsg("513-1", $FF, $96, $00, $00)
            createconsolemsg("860-2", $FF, $96, $00, $00)
            createconsolemsg("939", $FF, $96, $00, $00)
            createconsolemsg("966", $FF, $96, $00, $00)
            createconsolemsg("999", $FF, $96, $00, $00)
            createconsolemsg("1048", $FF, $96, $00, $00)
            createconsolemsg("1048-a", $FF, $96, $00, $00)
            createconsolemsg("1499-1", $FF, $96, $00, $00)
            createconsolemsg("apache", $FF, $96, $00, $00)
            createconsolemsg("class-d", $FF, $96, $00, $00)
            createconsolemsg("cockroach", $FF, $96, $00, $00)
            createconsolemsg("guard", $FF, $96, $00, $00)
            createconsolemsg("mtf", $FF, $96, $00, $00)
            createconsolemsg("tentacle", $FF, $96, $00, $00)
            createconsolemsg("--------------------------------", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "spawn","s"
            local14 = lower(right(consoleinput, (len(consoleinput) - instr(consoleinput, " ", $01))))
            local15 = piece(local14, $01, " ")
            local16 = piece(local14, $02, " ")
            If (local15 <> local16) Then
                consolespawnnpc(local15, local16)
            Else
                consolespawnnpc(local15, "")
            EndIf
        Case "infinitestamina","infstam","is"
            local15 = lower(right(consoleinput, (len(consoleinput) - instr(consoleinput, " ", $01))))
            Select local15
                Case "on","1","true"
                    chs\Field6 = $01
                Case "off","0","false"
                    chs\Field6 = $00
                Default
                    chs\Field6 = (chs\Field6 = $00)
            End Select
            If (chs\Field6 <> 0) Then
                createconsolemsg(getlocalstring("console", "is.on"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
            Else
                createconsolemsg(getlocalstring("console", "is.off"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
            EndIf
        Case "money","rich"
            For local13 = $01 To $14 Step $01
                If (rand($02, $01) = $01) Then
                    local15 = "Quarter"
                    local12 = $6A
                Else
                    local15 = "Coin"
                    local12 = $6B
                EndIf
                local5 = createitem(local15, local12, (entityx(XZ0260X8X2\Field74, $01, 1.0) + (cos((18.0 * (Float local13))) * rnd(0.3, 0.5))), entityy(camera, $01, 1.0), (entityz(XZ0260X8X2\Field74, $01, 1.0) + (sin((18.0 * (Float local13))) * rnd(0.3, 0.5))), $00, $00, $00, 1.0, $00)
                entitytype(local5\Field9, $03, $00)
            Next
        Case "doorcontrol"
            local15 = lower(right(consoleinput, (len(consoleinput) - instr(consoleinput, " ", $01))))
            Select local15
                Case "on","1","true"
                    remotedooron = $01
                Case "off","0","false"
                    remotedooron = $00
                Default
                    remotedooron = (remotedooron = $00)
            End Select
            If (remotedooron <> 0) Then
                createconsolemsg(getlocalstring("console", "door.on"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
            Else
                createconsolemsg(getlocalstring("console", "door.off"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
            EndIf
            For local3 = Each events
                If (local3\Field32 = $3B) Then
                    updatelever(local3\Field19\Field9[$02]\Field1, $00, $50, -80.0)
                    rotateentity(local3\Field19\Field9[$02]\Field1, ((-160.0 * (Float remotedooron)) + 80.0), entityyaw(local3\Field19\Field9[$02]\Field1, $00, 1.0), 0.0, $00)
                    Exit
                EndIf
            Next
        Case "unlockcheckpoints"
            For local3 = Each events
                If (local3\Field32 = $0C) Then
                    local3\Field1 = 0.0
                    updatelever(local3\Field19\Field9[$00]\Field1, $00, $50, -80.0)
                    rotateentity(local3\Field19\Field9[$00]\Field1, 80.0, entityyaw(local3\Field19\Field9[$00]\Field1, $00, 1.0), 0.0, $00)
                ElseIf (local3\Field32 = $23) Then
                    local3\Field4 = 2.0
                    updatelever(local3\Field19\Field27[$01], $00, $50, -80.0)
                    rotateentity(local3\Field19\Field27[$01], 0.0, entityyaw(local3\Field19\Field27[$01], $00, 1.0), 0.0, $00)
                    If (local3\Field19\Field17[$00] <> Null) Then
                        freeemitter(local3\Field19\Field17[$00], $00)
                    EndIf
                EndIf
            Next
            createconsolemsg(getlocalstring("console", "uc"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "disablenuke"
            For local2 = Each events
                If (local2\Field32 = $1F) Then
                    local2\Field4 = 0.0
                    updatelever(local2\Field19\Field9[$00]\Field1, $00, $50, -80.0)
                    updatelever(local2\Field19\Field9[$01]\Field1, $00, $50, -80.0)
                    rotateentity(local2\Field19\Field9[$00]\Field1, 80.0, entityyaw(local2\Field19\Field9[$00]\Field1, $00, 1.0), 0.0, $00)
                    rotateentity(local2\Field19\Field9[$01]\Field1, 80.0, entityyaw(local2\Field19\Field9[$01]\Field1, $00, 1.0), 0.0, $00)
                    Exit
                EndIf
            Next
        Case "unlockexits"
            local15 = lower(right(consoleinput, (len(consoleinput) - instr(consoleinput, " ", $01))))
            Select local15
                Case "a"
                    For local2 = Each events
                        If (local2\Field32 = $2E) Then
                            local2\Field1 = 1.0
                            local2\Field19\Field25[$01]\Field39 = $01
                            Exit
                        EndIf
                    Next
                    createconsolemsg(getlocalstring("console", "ue.a"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Case "b"
                    For local2 = Each events
                        If (local2\Field32 = $2C) Then
                            local2\Field1 = 1.0
                            local2\Field19\Field25[$01]\Field39 = $01
                            Exit
                        EndIf
                    Next
                    createconsolemsg(getlocalstring("console", "ue.b"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Default
                    For local2 = Each events
                        If (((local2\Field32 = $2C) Lor (local2\Field32 = $2E)) <> 0) Then
                            local2\Field1 = 1.0
                            local2\Field19\Field25[$01]\Field39 = $01
                        EndIf
                        If (local2\Field32 = $29) Then
                            local2\Field4 = 1.0
                        EndIf
                    Next
                    createconsolemsg(getlocalstring("console", "ue"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
            End Select
            remotedooron = $01
        Case "kill","suicide"
            chs\Field0 = $00
            kill($00, $01, $00, $01)
            Select rand($04, $01)
                Case $01
                    msg\Field8 = getlocalstring("death", "kill_1")
                Case $02
                    msg\Field8 = format(getlocalstring("death", "kill_2"), subjectname, "%s")
                Case $03
                    msg\Field8 = getlocalstring("death", "kill_3")
                Case $04
                    msg\Field8 = format(getlocalstring("death", "kill_4"), subjectname, "%s")
            End Select
        Case "tele"
            local14 = lower(right(consoleinput, (len(consoleinput) - instr(consoleinput, " ", $01))))
            local15 = piece(local14, $01, " ")
            local16 = piece(local14, $02, " ")
            local17 = piece(local14, $03, " ")
            positionentity(XZ0260X8X2\Field74, (Float local15), (Float local16), (Float local17), $00)
            positionentity(camera, (Float local15), (Float local16), (Float local17), $00)
            resetentity(XZ0260X8X2\Field74)
            resetentity(camera)
            createconsolemsg(format(format(format(getlocalstring("console", "tele"), (Str entityx(XZ0260X8X2\Field74, $00, 1.0)), "{0}"), (Str entityy(XZ0260X8X2\Field74, $00, 1.0)), "{1}"), (Str entityz(XZ0260X8X2\Field74, $00, 1.0)), "{2}"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "asd"
            chs\Field2 = $01
            chs\Field8 = $01
            chs\Field7 = $01
            chs\Field0 = $01
            chs\Field6 = $01
            fog\Field13 = 17.0
            killsounds($01)
            For local2 = Each events
                If (local2\Field32 = $03) Then
                    For local13 = $00 To $02 Step $01
                        If (local2\Field19\Field32[local13] <> Null) Then
                            removenpc(local2\Field19\Field32[local13])
                        EndIf
                        If (local13 < $02) Then
                            freeentity(local2\Field19\Field27[local13])
                            local2\Field19\Field27[local13] = $00
                        EndIf
                    Next
                    If (local2\Field19\Field32[$07] <> Null) Then
                        local2\Field19\Field32[$07]\Field57 = 2.0
                        local2\Field19\Field32[$07]\Field1 = $01
                    EndIf
                    If (n_i\Field3 <> Null) Then
                        If (1.0 = n_i\Field3\Field31) Then
                            n_i\Field3\Field31 = 0.0
                        EndIf
                        positionentity(n_i\Field3\Field82, 0.0, -500.0, 0.0, $00)
                        resetentity(n_i\Field3\Field82)
                    EndIf
                    positionentity(local2\Field19\Field27[$02], entityx(local2\Field19\Field27[$02], $01, 1.0), (local2\Field19\Field3 + 1.5), entityz(local2\Field19\Field27[$02], $01, 1.0), $01)
                    rotateentity(local2\Field19\Field27[$02], entitypitch(local2\Field19\Field27[$02], $01, 1.0), entityyaw(local2\Field19\Field27[$02], $01, 1.0), entityroll(local2\Field19\Field27[$02], $01, 1.0), $01)
                    removeevent(local2)
                    Exit
                EndIf
            Next
            createconsolemsg(getlocalstring("console", "stfu"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "notarget","nt"
            local15 = lower(right(consoleinput, (len(consoleinput) - instr(consoleinput, " ", $01))))
            Select local15
                Case "on","1","true"
                    chs\Field8 = $01
                Case "off","0","false"
                    chs\Field8 = $00
                Default
                    chs\Field8 = (chs\Field8 = $00)
            End Select
            If (chs\Field8 <> 0) Then
                createconsolemsg(getlocalstring("console", "nt.on"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
            Else
                createconsolemsg(getlocalstring("console", "nt.off"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
            EndIf
        Case "spawnpumpkin","pumpkin"
            createconsolemsg(getlocalstring("console", "pumpkin"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "teleport173"
            positionentity(n_i\Field3\Field82, entityx(XZ0260X8X2\Field74, $00, 1.0), (entityy(XZ0260X8X2\Field74, $00, 1.0) + 0.2), entityz(XZ0260X8X2\Field74, $00, 1.0), $00)
            resetentity(n_i\Field3\Field82)
        Case "seteventstate"
            local14 = lower(right(consoleinput, (len(consoleinput) - instr(consoleinput, " ", $01))))
            local15 = piece(local14, $01, " ")
            local16 = piece(local14, $02, " ")
            local17 = piece(local14, $03, " ")
            local18 = piece(local14, $04, " ")
            local36 = $00
            If (((((local15 = "") Lor (local16 = "")) Lor (local17 = "")) Lor (local18 = "")) <> 0) Then
                createconsolemsg(getlocalstring("console", "ses.failed"), $FF, $96, $00, $00)
            Else
                For local2 = Each events
                    If (playerroom = local2\Field19) Then
                        If (lower(local15) <> "keep") Then
                            local2\Field4 = (Float local15)
                        EndIf
                        If (lower(local16) <> "keep") Then
                            local2\Field7 = (Float local16)
                        EndIf
                        If (lower(local17) <> "keep") Then
                            local2\Field1 = (Float local17)
                        EndIf
                        If (lower(local18) <> "keep") Then
                            local2\Field23 = (Float local18)
                        EndIf
                        createconsolemsg(format(format(format(format(getlocalstring("console", "ses.success"), (Str local2\Field4), "{0}"), (Str local2\Field7), "{1}"), (Str local2\Field1), "{2}"), (Str local2\Field23), "{3}"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                        local36 = $01
                        Exit
                    EndIf
                Next
                If (local36 = $00) Then
                    createconsolemsg(getlocalstring("console", "ses.failed.apply"), $FF, $96, $00, $00)
                EndIf
            EndIf
        Case "giveachievement"
            If (instr(consoleinput, " ", $01) <> $00) Then
                local15 = lower(right(consoleinput, (len(consoleinput) - instr(consoleinput, " ", $01))))
            Else
                local15 = ""
            EndIf
            If (local15 = "all") Then
                local37 = TD4644B68Z(TX0Z2Z4F86D(achievementsarray, "achievements"))
                local38 = TD0DFDZ4XX(local37)
                For local13 = $00 To (local38 - $01) Step $01
                    local39 = TX240XXB6Z6(TX0Z2Z4F86D(D8XX4X0D0(local37, local13), "id"))
                    If (opt\Field30 <> 0) Then
                        giveachievement(local39, $01)
                    ElseIf ((((local39 <> "console") And (local39 <> "keter")) And (local39 <> "apollyon")) <> 0) Then
                        giveachievement(local39, $01)
                    EndIf
                Next
                saveachievementsfile()
                createconsolemsg(getlocalstring("console", "ga.all"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
            ElseIf (TX6ZD06226X(achievementsindex, local15) <> 0) Then
                If ((((local15 <> "console") And (local15 <> "keter")) And (local15 <> "apollyon")) <> 0) Then
                    giveachievement(local15, $01)
                    local40 = TX0Z2Z4F86D(TX0Z2Z4F86D(TX0Z2Z4F86D(localachievementsarray, "translations"), local15), "name")
                    If (TF46ZF6DB6(local40) <> 0) Then
                        local40 = TX0Z2Z4F86D(TX0Z2Z4F86D(TX0Z2Z4F86D(achievementsarray, "translations"), local15), "name")
                    EndIf
                    createconsolemsg(format(getlocalstring("console", "ga.success"), TX240XXB6Z6(local40), "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                Else
                    createconsolemsg(format(getlocalstring("console", "ga.cheat"), local15, "%s"), $FF, $00, $00, $00)
                EndIf
            ElseIf (local15 <> "all") Then
                createconsolemsg(format(getlocalstring("console", "ga.failed"), local15, "%s"), $FF, $00, $00, $00)
            EndIf
        Case "427state"
            local15 = lower(right(consoleinput, (len(consoleinput) - instr(consoleinput, " ", $01))))
            i_427\Field1 = (70.0 * (Float local15))
            createconsolemsg(format(getlocalstring("console", "427"), local15, "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "teleport106"
            If (n_i\Field2\Field93 = $00) Then
                n_i\Field2\Field66 = 2.0
                n_i\Field2\Field31 = 0.0
                n_i\Field2\Field60 = entityx(XZ0260X8X2\Field74, $00, 1.0)
                n_i\Field2\Field61 = entityy(XZ0260X8X2\Field74, $00, 1.0)
                n_i\Field2\Field74 = entityz(XZ0260X8X2\Field74, $00, 1.0)
            EndIf
        Case "jorge"
            createconsolemsg(getlocalstring("console", "jorge"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "resetfunds"
            For local5 = Each items
                Select local5\Field6\Field9
                    Case $61
                        local5\Field15 = 10.0
                    Case $62
                        local5\Field15 = 1000.0
                End Select
            Next
            createconsolemsg(getlocalstring("console", "funds"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "codes"
            createconsolemsg(getlocalstring("console", "codes_1"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
            createconsolemsg("", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
            createconsolemsg(format(getlocalstring("console", "codes_9"), (Str code_dr_gears), "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
            createconsolemsg(format(getlocalstring("console", "codes_3"), "7816", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
            createconsolemsg(format(getlocalstring("console", "codes_4"), "2411", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
            createconsolemsg(format(getlocalstring("console", "codes_2"), (Str code_dr_maynard), "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
            createconsolemsg(format(getlocalstring("console", "codes_10"), (Str T20200F42ZD), "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
            createconsolemsg(format(getlocalstring("console", "codes_6"), (Str code_maintenance_tunnels), "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
            createconsolemsg(format(getlocalstring("console", "codes_7"), "5731", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
            createconsolemsg("", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
            createconsolemsg(getlocalstring("console", "codes_8"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "rufino"
            For local6 = Each npcs
                If (local6\Field77 = $16) Then
                    changenpctextureid(local6, $0D)
                EndIf
            Next
        Case "blur"
            local15 = lower(right(consoleinput, (len(consoleinput) - instr(consoleinput, " ", $01))))
            XZ0260X8X2\Field64 = (Float local15)
            createconsolemsg("Done", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "noff"
            local15 = lower(right(consoleinput, (len(consoleinput) - instr(consoleinput, " ", $01))))
            X048ZF260(XF808DD2ZX, (Float local15))
            createconsolemsg("Done", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "sbias"
            local15 = lower(right(consoleinput, (len(consoleinput) - instr(consoleinput, " ", $01))))
            X048ZF260((Float local15), X8D40BB8XF)
            createconsolemsg("Done", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "genenv"
            local15 = lower(right(consoleinput, (len(consoleinput) - instr(consoleinput, " ", $01))))
            local42 = (Int local15)
            If (((local42 >= $01) And (local42 <= $1000)) <> 0) Then
                local43 = createtexture((local42 * $06), local42, $4001, $01)
                local44 = T20BFF42662(local42, entityx(camera, $00, 1.0), entityy(camera, $00, 1.0), entityz(camera, $00, 1.0))
                For local13 = $00 To $05 Step $01
                    setcubeface(local44, local13)
                    copyrect($00, $00, local42, local42, (local42 * local13), $00, texturebuffer(local44, $00), texturebuffer(local43, $00))
                Next
                savebuffer(texturebuffer(local43, $00), (("GFX\EnvMaps\Environment" + (Str XZ0260X8X2\Field10)) + ".png"))
                freetexture(local44)
                freetexture(local43)
                createconsolemsg((("Environment map saved to GFX\EnvMaps\Environment" + (Str XZ0260X8X2\Field10)) + ".png"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
            Else
                createconsolemsg("Environment map size must be from 1 to 8192", $FF, $00, $00, $00)
            EndIf
        Case "slopebias"
            local15 = lower(right(consoleinput, (len(consoleinput) - instr(consoleinput, " ", $01))))
            FBXZ62B06 = (Float local15)
            createconsolemsg("Done", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        Case "spec"
            local14 = lower(right(consoleinput, (len(consoleinput) - instr(consoleinput, " ", $01))))
            local15 = piece(local14, $01, " ")
            local16 = piece(local14, $02, " ")
            local45 = camerapick(camera, (Float (opt\Field21 Sar $01)), (Float (opt\Field46 Sar $01)))
            If (((local45 <> $00) And (pickedsurface() <> $00)) <> 0) Then
                local46 = $00
                local47 = getsurfacebrush(pickedsurface())
                If (local47 <> $00) Then
                    local46 = getbrushtexture(local47, $00)
                    If (local46 <> $00) Then
                        createconsolemsg(("Changed " + strippath(texturename(local46))), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                        freetexture(local46)
                    EndIf
                    brushshininess(local47, (Float local15), (Float local16))
                    paintsurface(pickedsurface(), local47)
                    freebrush(local47)
                EndIf
            Else
                createconsolemsg("Can't pick", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
            EndIf
        Case "notags"
            local15 = lower(right(consoleinput, (len(consoleinput) - instr(consoleinput, " ", $01))))
            Select local15
                Case "on","1","true"
                    T8X2046020\Field13 = $01
                Case "off","0","false"
                    T8X2046020\Field13 = $00
                Default
                    T8X2046020\Field13 = (T8X2046020\Field13 = $00)
            End Select
            If (T8X2046020\Field13 <> 0) Then
                createconsolemsg("Player tags disabled", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
            Else
                createconsolemsg("Player tags enabled", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
            EndIf
        Case "setemitter"
            local15 = lower(right(consoleinput, (len(consoleinput) - instr(consoleinput, " ", $01))))
            setemitter(Null, entityx(XZ0260X8X2\Field74, $01, 1.0), entityy(XZ0260X8X2\Field74, $01, 1.0), entityz(XZ0260X8X2\Field74, $01, 1.0), (Int min((Float (Int local15)), 254.0)))
        Default
            createconsolemsg(getlocalstring("console", "notfound"), $FF, $00, $00, $00)
    End Select
    consoleinput = ""
    If (arg1 = $00) Then
        consoleinput = local0
    EndIf
    Return $00
End Function

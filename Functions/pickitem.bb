Function pickitem%(arg0.items, arg1%)
    Local local0.itemtemplates
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    Local local6%
    Local local7%
    If ((((((menuopen Lor consoleopen) Lor i_294\Field4) Lor (d_i\Field3 <> Null)) Lor (selectedscreen <> Null)) Lor (Int XZ0260X8X2\Field48)) <> 0) Then
        Return $00
    EndIf
    catcherrors("PickItem()")
    local3 = $01
    local4 = $01
    For local1 = $00 To (maxitemamount - $01) Step $01
        If (TX60DB8XBBZ(local1) = Null) Then
            Select arg0\Field6\Field9
                Case $21
                    use1123()
                    If ((((i_714\Field0 <> $02) And (T8660BZ460\Field3 <> $04)) And (T8660BZ460\Field10 = $00)) <> 0) Then
                        Return $00
                    EndIf
                Case $54
                    XZ0260X8X2\Field78 = 1.0
                    playsound_strict(snd_i\Field5[rand($00, $02)], $00, $00)
                    msg\Field8 = format(getlocalstring("death", "killbat"), subjectname, "%s")
                    kill($00, $01, $00, $01)
                Case $0A
                    giveachievement("148", $01)
                Case $60
                    giveachievement("omni", $01)
                Case $06,$07
                    giveachievement("005", $01)
                Case $08
                    giveachievement("005", $01)
                    If (((0.0 = i_409\Field0) And (i_427\Field2 = $00)) <> 0) Then
                        XZ0260X8X2\Field64 = max(1000.0, XZ0260X8X2\Field64)
                        i_409\Field0 = 0.001
                    EndIf
                Case $2A
                    createmsg(getlocalstring("msg", "vfvest"), 6.0)
                    Return $00
                Case $29
                    createmsg(getlocalstring("msg", "corrvest"), 6.0)
                    Return $00
                Case $34,$36,$37,$35
                    arg0\Field15 = 0.0
                Case $4C
                    giveachievement("snav", $01)
                Case $27,$28
                    For local2 = $00 To (maxitemamount - $01) Step $01
                        If (TX60DB8XBBZ(local2) <> Null) Then
                            If (((TX60DB8XBBZ(local2)\Field6\Field9 = $27) Lor (TX60DB8XBBZ(local2)\Field6\Field9 = $28)) <> 0) Then
                                local4 = $00
                            ElseIf (((((TX60DB8XBBZ(local2)\Field6\Field9 = $3C) Lor (TX60DB8XBBZ(local2)\Field6\Field9 = $3D)) Lor (TX60DB8XBBZ(local2)\Field6\Field9 = $3E)) Lor (TX60DB8XBBZ(local2)\Field6\Field9 = $3F)) <> 0) Then
                                local4 = $02
                            EndIf
                        EndIf
                    Next
                    If (local4 = $00) Then
                        createmsg(getlocalstring("msg", "twovest"), 6.0)
                        Return $00
                    ElseIf (local4 = $02) Then
                        createmsg(getlocalstring("msg", "vestsuit"), 6.0)
                        Return $00
                    ElseIf (GUESSEDupdatexdb() = $00) Then
                        selecteditem = arg0
                    EndIf
                Case $3C,$3D,$3E,$3F
                    If (GUESSEDupdatexdb() <> 0) Then
                        If (T8660BZ460\Field6 > $00) Then
                            local4 = $02
                        ElseIf (T8660BZ460\Field10 > $00) Then
                            local4 = $00
                        EndIf
                    Else
                        For local2 = $00 To (maxitemamount - $01) Step $01
                            If (TX60DB8XBBZ(local2) <> Null) Then
                                If (((((TX60DB8XBBZ(local2)\Field6\Field9 = $3C) Lor (TX60DB8XBBZ(local2)\Field6\Field9 = $3D)) Lor (TX60DB8XBBZ(local2)\Field6\Field9 = $3E)) Lor (TX60DB8XBBZ(local2)\Field6\Field9 = $3F)) <> 0) Then
                                    local4 = $00
                                ElseIf (((TX60DB8XBBZ(local2)\Field6\Field9 = $27) Lor (TX60DB8XBBZ(local2)\Field6\Field9 = $28)) <> 0) Then
                                    local4 = $02
                                EndIf
                            EndIf
                        Next
                    EndIf
                    If (local4 = $00) Then
                        createmsg(getlocalstring("msg", "twosuit"), 6.0)
                        Return $00
                    ElseIf (local4 = $02) Then
                        createmsg(getlocalstring("msg", "vestsuit"), 6.0)
                        Return $00
                    Else
                        selecteditem = arg0
                    EndIf
                Case $7C
                    For local2 = $00 To (maxitemamount - $01) Step $01
                        If (TX60DB8XBBZ(local2) <> Null) Then
                            If (TX60DB8XBBZ(local2)\Field6\Field9 = $7C) Then
                                local4 = $00
                                Exit
                            EndIf
                        EndIf
                    Next
                    If (local4 = $00) Then
                        createmsg(getlocalstring("mpmsg", "backpack.two"), 6.0)
                        Return $00
                    EndIf
                Case $4F
                    For local0 = Each itemtemplates
                        If (local0\Field9 = $00) Then
                            local6 = (((((((local0\Field19 = "Leaflet") Lor (local0\Field19 = "Drawing")) Lor (local0\Field19 = "Note from Maynard")) Lor (local0\Field19 = "SCP-085")) Lor (local0\Field19 = "Newspaper")) Lor (local0\Field9 = $01)) = $00)
                            If (local6 <> 0) Then
                                For local7 = $01 To $62 Step $01
                                    If (arg0\Field0[local7] = Null) Then
                                        arg0\Field0[local7] = local0
                                        arg0\Field32 = $62
                                        local0\Field6 = $01
                                        Exit
                                    EndIf
                                Next
                            EndIf
                        EndIf
                    Next
            End Select
            If (((arg0\Field6\Field5 <> $42) And arg1) <> 0) Then
                playsoundex(snd_i\Field46[arg0\Field6\Field5], camera, arg0\Field9, 3.0, 1.0, $00, $00)
            EndIf
            arg0\Field17 = $01
            arg0\Field30 = $FFFFFFFF
            arg0\Field6\Field6 = $01
            If (arg0\Field36 > $00) Then
                For local2 = $00 To (arg0\Field36 - $01) Step $01
                    If (arg0\Field8[local2] <> Null) Then
                        arg0\Field8[local2]\Field6\Field6 = $01
                    EndIf
                Next
            EndIf
            TX60DB8XBBZ(local1) = arg0
            hideentity(arg0\Field9)
            GUESSEDsetpickitem(arg0)
            If (arg1 <> 0) Then
                XZ0260X8X2\Field68 = max(2.0, XZ0260X8X2\Field68)
            EndIf
            local3 = $00
            GUESSEDactivateentity(arg0)
            Exit
        EndIf
    Next
    If (local3 <> 0) Then
        createmsg(getlocalstring("msg", "cantcarry"), 6.0)
    EndIf
    catcherrors("Uncaught: PickItem()")
    Return $00
    Return $00
End Function

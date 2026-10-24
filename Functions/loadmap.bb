Function loadmap%(arg0$)
    Local local0.rooms
    Local local1.roomtemplates
    Local local2.events
    Local local3%
    Local local4%
    Local local5%
    Local local6$
    Local local7%
    Local local8%
    Local local9#
    Local local10%
    Local local11%
    Local local12%
    Local local13.rooms
    Local local14.forest
    Local local16%
    Local local17%
    Local local18%
    Local local21.rooms
    catcherrors((("LoadMap(" + arg0) + ")"))
    local3 = readfile_strict(arg0)
    Delete currmapgrid
    currmapgrid = (New mapgrid)
    If (right(arg0, $06) = "cbmap2") Then
        readline(local3)
        readline(local3)
        i_zone\Field1[$00] = readbyte(local3)
        i_zone\Field1[$01] = readbyte(local3)
        local10 = readint(local3)
        local11 = readint(local3)
        readint(local3)
        i_zone\Field0 = (local11 > $00)
        For local12 = $00 To (local10 - $01) Step $01
            local4 = readbyte(local3)
            local5 = readbyte(local3)
            local6 = lower(readstring(local3))
            local7 = findroomid(local6)
            local8 = (Int ((Float readbyte(local3)) * 90.0))
            For local1 = Each roomtemplates
                If (local1\Field21 = local7) Then
                    If (((90.0 <> (Float local8)) And (270.0 <> (Float local8))) <> 0) Then
                        local8 = (Int ((Float local8) + 180.0))
                    EndIf
                    local8 = (Int wrapangle((Float local8), 360.0))
                    local0 = createroom($00, local1\Field3, ((Float (X824BX6D68 - local4)) * 8.0), 0.0, ((Float local5) * 8.0), local7, (Float local8))
                    calculateroomextents(local0)
                    currmapgrid\Field4[((X824BX6D68 - local4) + (local5 * X824BX6D68))] = $01
                    Exit
                EndIf
            Next
            local6 = readstring(local3)
            local7 = findeventid(local6)
            local9 = readfloat(local3)
            If (local0 <> Null) Then
                If (0.0 < local9) Then
                    If (local9 >= rnd(0.0, 1.0)) Then
                        local2 = (New events)
                        local2\Field32 = local7
                        findeventvariable(local2)
                        local2\Field19 = local0
                    EndIf
                ElseIf (((0.0 = local9) And (local6 <> "")) <> 0) Then
                    local2 = (New events)
                    local2\Field32 = local7
                    findeventvariable(local2)
                    local2\Field19 = local0
                EndIf
            EndIf
        Next
        For local0 = Each rooms
            If (local0\Field22\Field21 = $63) Then
                local13 = local0
                Exit
            EndIf
        Next
        If (local13 <> Null) Then
            local14 = (New forest)
        EndIf
        For local12 = $00 To (local11 - $01) Step $01
            local4 = readbyte(local3)
            local5 = readbyte(local3)
            local6 = readstring(local3)
            local8 = readbyte(local3)
            If (((0.0 <> (Float local8)) And (2.0 <> (Float local8))) <> 0) Then
                local8 = (Int ((Float local8) + 2.0))
            EndIf
            local8 = (Int ((Float local8) + 1.0))
            If (3.0 < (Float local8)) Then
                local8 = (Int ((Float local8) Mod 4.0))
            EndIf
            local4 = ($09 - local4)
            If (local14 <> Null) Then
                Select local6
                    Case "scp-860-1 endroom"
                        local14\Field5[((local5 * $0A) + local4)] = (Int ((Float local8) + 1.0))
                    Case "scp-860-1 path"
                        local14\Field5[((local5 * $0A) + local4)] = (Int ((Float local8) + 5.0))
                    Case "scp-860-1 corner"
                        local14\Field5[((local5 * $0A) + local4)] = (Int ((Float local8) + 9.0))
                    Case "scp-860-1 t-shaped path"
                        local14\Field5[((local5 * $0A) + local4)] = (Int ((Float local8) + 13.0))
                    Case "scp-860-1 4-way path"
                        local14\Field5[((local5 * $0A) + local4)] = (Int ((Float local8) + 17.0))
                    Case "scp-860-1 door"
                        local14\Field5[((local5 * $0A) + local4)] = (Int ((Float local8) + 21.0))
                End Select
            EndIf
        Next
        If (local14 <> Null) Then
            local13\Field13 = local14
            placemapcreatorforest(local13\Field13, local13\Field40, (local13\Field3 + 30.0), local13\Field37, local13)
        EndIf
    Else
        i_zone\Field1[$00] = $0E
        i_zone\Field1[$01] = $07
        i_zone\Field0 = $00
        While (eof(local3) = $00)
            local4 = readbyte(local3)
            local5 = readbyte(local3)
            local6 = lower(readstring(local3))
            local7 = findroomid(local6)
            local8 = (Int ((Float readbyte(local3)) * 90.0))
            For local1 = Each roomtemplates
                If (local1\Field21 = local7) Then
                    If (((90.0 <> (Float local8)) And (270.0 <> (Float local8))) <> 0) Then
                        local8 = (Int ((Float local8) + 180.0))
                    EndIf
                    local8 = (Int wrapangle((Float local8), 360.0))
                    local0 = createroom($00, local1\Field3, ((Float (X824BX6D68 - local4)) * 8.0), 0.0, ((Float local5) * 8.0), local7, (Float local8))
                    calculateroomextents(local0)
                    currmapgrid\Field4[((X824BX6D68 - local4) + (local5 * X824BX6D68))] = $01
                    Exit
                EndIf
            Next
            local6 = readstring(local3)
            local7 = findeventid(local6)
            local9 = readfloat(local3)
            If (local0 <> Null) Then
                If (0.0 < local9) Then
                    If (local9 >= rnd(0.0, 1.0)) Then
                        local2 = (New events)
                        local2\Field32 = local7
                        findeventvariable(local2)
                        local2\Field19 = local0
                    EndIf
                ElseIf (((0.0 = local9) And (local6 <> "")) <> 0) Then
                    local2 = (New events)
                    local2\Field32 = local7
                    findeventvariable(local2)
                    local2\Field19 = local0
                EndIf
            EndIf
        Wend
    EndIf
    closefile(local3)
    local5 = X824BX6D68
    While (local5 >= $00)
        If (local5 < i_zone\Field1[$01]) Then
            local17 = $03
        ElseIf (((local5 >= i_zone\Field1[$01]) And (local5 < i_zone\Field1[$00])) <> 0) Then
            local17 = $02
        Else
            local17 = $01
        EndIf
        local4 = X824BX6D68
        While (local4 >= $00)
            If (currmapgrid\Field4[((local5 * X824BX6D68) + local4)] > $00) Then
                For local0 = Each rooms
                    local0\Field21 = (Int wrapangle((Float local0\Field21), 360.0))
                    If ((((Int (local0\Field40 / 8.0)) = local4) And ((Int (local0\Field37 / 8.0)) = local5)) <> 0) Then
                        Select local0\Field22\Field3
                            Case $00
                                local18 = (90.0 = (Float local0\Field21))
                            Case $01
                                local18 = ((90.0 = (Float local0\Field21)) Lor (270.0 = (Float local0\Field21)))
                            Case $02
                                local18 = ((0.0 = (Float local0\Field21)) Lor (90.0 = (Float local0\Field21)))
                            Case $03
                                local18 = (((0.0 = (Float local0\Field21)) Lor (180.0 = (Float local0\Field21))) Lor (90.0 = (Float local0\Field21)))
                            Default
                                local18 = $01
                        End Select
                        If (local18 <> 0) Then
                            If ((local4 + $01) < (X824BX6D68 + $01)) Then
                                If (currmapgrid\Field4[((local4 + $01) + (local5 * X824BX6D68))] > $00) Then
                                    local0\Field10[$00] = createdoor(local0, (((Float local4) * 8.0) + 4.0), 0.0, ((Float local5) * 8.0), 90.0, (Int max((Float rand($FFFFFFFD, $01)), 0.0)), (((local17 - $01) Mod $02) Shl $01), $00, $00, $00)
                                EndIf
                            EndIf
                        EndIf
                        Select local0\Field22\Field3
                            Case $00
                                local18 = (180.0 = (Float local0\Field21))
                            Case $01
                                local18 = ((0.0 = (Float local0\Field21)) Lor (180.0 = (Float local0\Field21)))
                            Case $02
                                local18 = ((180.0 = (Float local0\Field21)) Lor (90.0 = (Float local0\Field21)))
                            Case $03
                                local18 = (((180.0 = (Float local0\Field21)) Lor (90.0 = (Float local0\Field21))) Lor (270.0 = (Float local0\Field21)))
                            Default
                                local18 = $01
                        End Select
                        If (local18 <> 0) Then
                            If ((local5 + $01) < (X824BX6D68 + $01)) Then
                                If (currmapgrid\Field4[(((local5 + $01) * X824BX6D68) + local4)] > $00) Then
                                    local0\Field10[$03] = createdoor(local0, ((Float local4) * 8.0), 0.0, (((Float local5) * 8.0) + 4.0), 0.0, (Int max((Float rand($FFFFFFFD, $01)), 0.0)), (((local17 - $01) Mod $02) Shl $01), $00, $00, $00)
                                EndIf
                            EndIf
                        EndIf
                        Exit
                    EndIf
                Next
            EndIf
            local4 = (local4 + $FFFFFFFF)
        Wend
        local5 = (local5 + $FFFFFFFF)
    Wend
    local0 = createroom($00, $00, 0.0, 500.0, -80.0, $4E, 0.0)
    calculateroomextents(local0)
    createevent($2D, $4E, $00, 0.0)
    local0 = createroom($00, $00, 0.0, 500.0, -16.0, $4C, 0.0)
    calculateroomextents(local0)
    createevent($2F, $4C, $00, 0.0)
    local0 = createroom($00, $00, ((Float (X824BX6D68 + $02)) * 8.0), 0.0, ((Float (X824BX6D68 + $02)) * 8.0), $6F, 0.0)
    calculateroomextents(local0)
    createevent($4B, $6F, $00, 0.0)
    If (opt\Field3 <> 0) Then
        local0 = createroom($00, $00, 8.0, 250.0, ((Float (X824BX6D68 + $02)) * 8.0), $04, 0.0)
        calculateroomextents(local0)
        createevent($04, $04, $00, 0.0)
    EndIf
    local0 = createroom($00, $00, -16.0, 800.0, 0.0, $70, 0.0)
    calculateroomextents(local0)
    createevent($4C, $70, $00, 0.0)
    For local0 = Each rooms
        For local12 = $00 To $03 Step $01
            local0\Field29[local12] = Null
        Next
        For local21 = Each rooms
            If (local0 <> local21) Then
                If (local0\Field37 = local21\Field37) Then
                    If ((local0\Field40 + 8.0) = local21\Field40) Then
                        local0\Field29[$00] = local21
                        If (local0\Field10[$00] = Null) Then
                            local0\Field10[$00] = local21\Field10[$02]
                        EndIf
                    ElseIf ((local0\Field40 - 8.0) = local21\Field40) Then
                        local0\Field29[$02] = local21
                        If (local0\Field10[$02] = Null) Then
                            local0\Field10[$02] = local21\Field10[$00]
                        EndIf
                    EndIf
                ElseIf (local0\Field40 = local21\Field40) Then
                    If ((local0\Field37 - 8.0) = local21\Field37) Then
                        local0\Field29[$01] = local21
                        If (local0\Field10[$01] = Null) Then
                            local0\Field10[$01] = local21\Field10[$03]
                        EndIf
                    ElseIf ((local0\Field37 + 8.0) = local21\Field37) Then
                        local0\Field29[$03] = local21
                        If (local0\Field10[$03] = Null) Then
                            local0\Field10[$03] = local21\Field10[$01]
                        EndIf
                    EndIf
                EndIf
            EndIf
            If (((((local0\Field29[$00] <> Null) And (local0\Field29[$01] <> Null)) And (local0\Field29[$02] <> Null)) And (local0\Field29[$03] <> Null)) <> 0) Then
                Exit
            EndIf
        Next
    Next
    catcherrors((("Uncaught: LoadMap(" + arg0) + ")"))
    Return $00
End Function

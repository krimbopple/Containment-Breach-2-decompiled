Function quickloadevents%()
    Local local0.events
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    Local local5%
    Local local6#
    Local local7#
    Local local8#
    Local local11%
    Local local12.chunk
    If (quickload_currevent = Null) Then
        quickloadpercent = $FFFFFFFF
        Return $00
    EndIf
    catcherrors("QuickLoadEvents()")
    local0 = quickload_currevent
    Select local0\Field32
        Case $05
            If (((0.0 = local0\Field4) Lor (local0\Field9 <> "LoadDone")) <> 0) Then
                Select local0\Field9
                    Case "Load0"
                        local0\Field19\Field27[$02] = copyentity(n_i\Field9[$0B], $00)
                        local0\Field19\Field30[$02] = $01
                        quickloadpercent = $0F
                        local0\Field9 = "Load1"
                    Case "Load1"
                        local0\Field19\Field27[$03] = copyentity(n_i\Field9[$0C], $00)
                        local0\Field19\Field30[$03] = $01
                        quickloadpercent = $1E
                        local0\Field9 = "Load2"
                    Case "Load2"
                        local0\Field19\Field27[$04] = copyentity(n_i\Field9[$0D], $00)
                        local0\Field19\Field30[$04] = $01
                        quickloadpercent = $2D
                        local0\Field9 = "Load3"
                    Case "Load3"
                        local0\Field19\Field27[$05] = copyentity(n_i\Field9[$0E], $00)
                        local0\Field19\Field30[$05] = $01
                        quickloadpercent = $3C
                        local0\Field9 = "Load4"
                    Case "Load4"
                        For local5 = $02 To $05 Step $01
                            positionentity(local0\Field19\Field27[local5], entityx(local0\Field19\Field27[$00], $01, 1.0), entityy(local0\Field19\Field27[$00], $01, 1.0), entityz(local0\Field19\Field27[$00], $01, 1.0), $01)
                            rotateentity(local0\Field19\Field27[local5], -90.0, entityyaw(local0\Field19\Field27[$00], $01, 1.0), 0.0, $01)
                            scaleentity(local0\Field19\Field27[local5], 0.05, 0.05, 0.05, $01)
                        Next
                        quickloadpercent = $4B
                        local0\Field9 = "Load5"
                    Case "Load5"
                        For local5 = $02 To $05 Step $01
                            hideentity(local0\Field19\Field27[local5])
                        Next
                        quickloadpercent = $64
                        local0\Field9 = "LoadDone"
                End Select
            EndIf
        Case $4C
            If (0.0 = local0\Field4) Then
                If (local0\Field9 = "Load0") Then
                    quickloadpercent = $0A
                    local0\Field19\Field27[$00] = loadmesh_strict("GFX\Map\dimension1499\1499plane.b3d", $00, $01)
                    hideentity(local0\Field19\Field27[$00])
                    local0\Field19\Field30[$00] = $01
                    createconsolemsg("", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg(getlocalstring("misc", "warning2"), $FF, $00, $00, $00)
                    createconsolemsg("", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    local0\Field9 = "Load1"
                ElseIf (local0\Field9 = "Load1") Then
                    quickloadpercent = $1E
                    i_1499\Field4 = createsky("GFX\Map\Textures\1499sky", $00)
                    local0\Field9 = "1"
                Else
                    local11 = (Int local0\Field9)
                    If (local11 < $10) Then
                        quickloadpercent = (quickloadpercent + $02)
                        local0\Field19\Field27[local11] = loadrmesh((("GFX\Map\dimension1499\dimension_1499_object(" + (Str local11)) + ").rmesh"), Null, $00)
                        scaleentity(local0\Field19\Field27[local11], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
                        hideentity(local0\Field19\Field27[local11])
                        local0\Field9 = (Str (local11 + $01))
                    ElseIf (local11 = $10) Then
                        quickloadpercent = $5A
                        createchunkparts(local0\Field19)
                        local0\Field9 = "17"
                    ElseIf (local11 = $11) Then
                        quickloadpercent = $64
                        local6 = entityx(local0\Field19\Field15, $00, 1.0)
                        local7 = entityy(local0\Field19\Field15, $00, 1.0)
                        local8 = entityz(local0\Field19\Field15, $00, 1.0)
                        For local5 = $FFFFFFFE To $00 Step $02
                            local12 = createchunk(local0\Field19, $FFFFFFFF, (((Float local5) * 2.5) * local6), local7, local8, $01)
                            local12 = createchunk(local0\Field19, $FFFFFFFF, (((Float local5) * 2.5) * local6), local7, (local8 - 40.0), $01)
                        Next
                        local0\Field4 = 2.0
                        local0\Field9 = "18"
                    EndIf
                EndIf
            EndIf
    End Select
    catcherrors((("Uncaught: QuickLoadEvents(Event Name: ID: " + (Str local0\Field32)) + ")"))
    Return $00
End Function

Function loadroomtemplates%(arg0$)
    Local local0$
    Local local1%
    Local local2.roomtemplates
    Local local3$
    Local local4%
    Local local5%
    Local local6$
    Local local8.roomtemplates
    catcherrors((("LoadRoomTemplates(" + arg0) + ")"))
    local2 = Null
    local3 = ""
    local4 = openfile_strict(arg0)
    While (eof(local4) = $00)
        local0 = trim(readline(local4))
        If (left(local0, $01) = "[") Then
            local0 = mid(local0, $02, (len(local0) - $02))
            If (local0 <> "room ambience") Then
                local3 = inigetstring(arg0, local0, "Mesh Path", "", $01)
                local5 = $00
                local6 = lower(local0)
                For local2 = Each roomtemplates
                    If (local2\Field12 = local6) Then
                        local2\Field15 = ("GFX\Map\" + local3)
                        local5 = $01
                        Exit
                    EndIf
                Next
                If (local5 = $00) Then
                    local2 = createroomtemplate(local3)
                    local2\Field12 = local6
                    local2\Field21 = findroomid(local2\Field12)
                EndIf
                local3 = inigetstring(arg0, local0, "Shape", "", $01)
                Select local3
                    Case "1"
                        local2\Field3 = $00
                    Case "2"
                        local2\Field3 = $01
                    Case "2C"
                        local2\Field3 = $02
                    Case "3"
                        local2\Field3 = $03
                    Case "4"
                        local2\Field3 = $04
                End Select
                For local1 = $00 To $04 Step $01
                    local2\Field14[local1] = inigetint(arg0, local0, ("Zone" + (Str (local1 + $01))), $00, $01)
                Next
                local2\Field8 = inigetint(arg0, local0, "SpecialClip", $00, $01)
                local2\Field22 = (Int clamp((Float inigetint(arg0, local0, "Commonness", $00, $01)), 0.0, 100.0))
                local2\Field20 = inigetint(arg0, local0, "DisableDecals", $00, $01)
                local2\Field13 = inigetint(arg0, local0, "DisableOverlapCheck", $00, $01)
                If ((inigetint(arg0, local0, "Additive", $00, $01) And (local5 = $00)) <> 0) Then
                    local2\Field5 = $01
                    local2\Field1 = (Int clamp((Float inigetint(arg0, local0, "AZone", $00, $01)), 0.0, 2.0))
                    local2\Field6 = clamp(inigetfloat(arg0, local0, "AChance", 0.0, $01), 0.0, 1.0)
                    local2\Field21 = inigetint(arg0, local0, "ARoomID", $00, $01)
                    local2\Field11 = inigetint(arg0, local0, "ASurface", $00, $01)
                    For local8 = Each roomtemplates
                        If (((local8\Field21 = local2\Field21) And (local2 <> local8)) <> 0) Then
                            removeroomtemplate(local8)
                        EndIf
                    Next
                EndIf
            EndIf
        EndIf
    Wend
    local1 = $00
    Repeat
        local3 = inigetstring(arg0, "room ambience", ("Ambience" + (Str local1)), "", $01)
        If (local3 = "") Then
            Exit
        EndIf
        roomambience[local1] = loadsound_strict(local3)
        local1 = (local1 + $01)
    Forever
    closefile(local4)
    catcherrors((("Uncaught: LoadRoomTemplates(" + arg0) + ")"))
    Return $00
End Function

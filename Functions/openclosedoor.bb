Function openclosedoor%(arg0.doors, arg1%, arg2%)
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    arg0\Field23 = arg2
    arg0\Field39 = (arg0\Field39 = $00)
    If (arg0\Field26 <> Null) Then
        arg0\Field26\Field39 = (arg0\Field26\Field39 = $00)
        arg0\Field23 = $01
        arg0\Field26\Field23 = $01
    EndIf
    If (arg0\Field19 <> 0) Then
        arg0\Field25 = 210.0
    EndIf
    If (arg0\Field39 <> 0) Then
        If (arg0\Field26 <> Null) Then
            arg0\Field26\Field9 = (Float arg0\Field26\Field33)
        EndIf
        arg0\Field9 = (Float arg0\Field33)
    EndIf
    local0 = arg0\Field46
    If (((local0 = $07) Lor (local0 = $08)) <> 0) Then
        local0 = $00
    EndIf
    If (arg1 <> 0) Then
        local1 = rand($00, $02)
        If (local0 = $05) Then
            If (playerroom\Field22\Field21 = $63) Then
                local1 = $02
            Else
                local1 = rand($00, $01)
            EndIf
        EndIf
        local3 = TX6X4XZX2F(local0, local1)
        If (((local0 = $03) And (arg0\Field21 = $02)) <> 0) Then
            local2 = snd_i\Field47[rand($00, $02)]
        Else
            local2 = TZ2064ZFDB(local0, local1)
        EndIf
        If (arg0\Field5 <> 0) Then
            local3 = snd_i\Field48[local0]
            local2 = snd_i\Field36[local0]
        EndIf
        If (0.0 >= arg0\Field14) Then
            If (arg0\Field39 <> 0) Then
                arg0\Field45 = playsoundex(local2, camera, arg0\Field0, 10.0, 1.0, $00, $00)
                local4 = local2
            Else
                arg0\Field45 = playsoundex(local3, camera, arg0\Field0, 10.0, 1.0, $00, $00)
                local4 = local3
            EndIf
            If (CB64D8DZF <> Null) Then
                GUESSEDisentity_10(CB64D8DZF, GUESSEDopenopenclosedoor(local4), arg0\Field0, 10.0, 1.0)
            EndIf
            arg0\Field14 = 25.0
        EndIf
    EndIf
    arg0\Field34 = 0.0
    Return $00
End Function

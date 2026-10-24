Function TX0Z8FFZ8Z0%(arg0.T24B4ZF6F6, arg1.items, arg2%)
    If (((arg0 = Null) And arg2) <> 0) Then
        If (((DZ64X028\Field18 <> Null) And (DZ64X028\Field18\Field3\Field20[$07] <> $00)) <> 0) Then
            If (DZ64X028\Field46 <> $07) Then
                TBZXD06BBZ($07, $03, 0.0, 0.0, 1.0)
            EndIf
        Else
            TX0Z8FFZ8Z0(Null, Null, $00)
        EndIf
        Return $00
    EndIf
    DZ64X028\Field64 = $00
    If (((DZ64X028\Field18 <> arg0) Lor (arg1 <> DZ64X028\Field61)) <> 0) Then
        T2F0DXZBD8(DZ64X028\Field18)
        X64FDD8D4D(arg0)
        DZ64X028\Field18 = arg0
        If (arg0 <> Null) Then
            DZ64X028\Field50 = findchild(DZ64X028\Field18\Field9, "weaponfire")
            T68D24B6DX(arg0\Field3\Field1, 1.0)
            TBZXD06BBZ($02, $03, 0.0, 0.0, 1.0)
            hideentity(DZ64X028\Field65)
            DZ64X028\Field58 = 0.0
            DZ64X028\Field66 = 255.0
            DZ64X028\Field64 = (arg1 <> Null)
        EndIf
    EndIf
    DZ64X028\Field61 = arg1
    Return $00
End Function

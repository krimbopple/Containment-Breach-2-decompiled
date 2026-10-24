Function XDF40D6XXF%()
    Local local0%
    Local local1#
    Local local2.Y0D6F4BXB0
    Local local3.rooms
    If (opt\Field6 = $00) Then
        Return $00
    EndIf
    ZX0F0Z06F = 1.0
    hidedistance = 15.0
    secondarylighton = 1.0
    local0 = $01
    local1 = opt\Field50
    opt\Field50 = 1.0
    fps\Field3[$00] = 1.0
    fps\Field3[$01] = 1.0
    waittextures()
    For local2 = Each Y0D6F4BXB0
        If (local2\Field9 = $00) Then
            For local3 = Each rooms
                If (local3\Field22 = local2\Field7) Then
                    playerroom = local3
                    positionentity(XZ0260X8X2\Field74, entityx(local3\Field12, $01, 1.0), entityy(local3\Field12, $01, 1.0), entityz(local3\Field12, $01, 1.0), $00)
                    positionentity(camera, entityx(local3\Field12, $01, 1.0), entityy(local3\Field12, $01, 1.0), entityz(local3\Field12, $01, 1.0), $00)
                    BXZDBZ0BB\Field4 = 0.0
                    BXZDBZ0BB\Field1 = 8.0
                    updaterooms()
                    updatezonecolor()
                    updatelightvolume()
                    camerarange(camera, 0.1, 10000.0)
                    updatelights()
                    tformpoint(local2\Field20, local2\Field3, local2\Field18, local3\Field15, $00)
                    local2\Field9 = T20BFF42662($40, tformedx(), tformedy(), tformedz())
                    local2\Field11 = (Int fog\Field9)
                    local2\Field8 = (Int fog\Field16)
                    local2\Field4 = (Int fog\Field7)
                    local2\Field19 = local3\Field21
                    Exit
                EndIf
            Next
        EndIf
    Next
    playerroom = Null
    For local3 = Each rooms
        local3\Field7 = $00
    Next
    opt\Field50 = local1
    local0 = $00
    secondarylighton = 0.0
    ZX0F0Z06F = 100.0
    Return $00
End Function

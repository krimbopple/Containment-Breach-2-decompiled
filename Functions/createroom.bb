Function createroom.rooms(arg0%, arg1%, arg2#, arg3#, arg4#, arg5%, arg6#)
    Local local0.rooms
    Local local1.roomtemplates
    Local local2%
    Local local3%
    Local local4%
    Local local5%
    catcherrors((((((((((("CreateRoom.Rooms(" + (Str arg1)) + ", ") + (Str arg2)) + ", ") + (Str arg3)) + ", ") + (Str arg4)) + ", ") + (Str arg5)) + ")"))
    local0 = (New rooms)
    local0\Field0 = arg0
    local0\Field40 = arg2
    local0\Field3 = arg3
    local0\Field37 = arg4
    GUESSEDcreateroom(local0)
    If (arg5 <> $FFFFFFFF) Then
        For local1 = Each roomtemplates
            If (local1\Field21 = arg5) Then
                local0\Field22 = local1
                local3 = rndseed()
                If (local1\Field0 = $00) Then
                    loadroommesh(local1)
                EndIf
                local0\Field15 = copyentity(local1\Field0, $00)
                local0\Field31 = createpivot(local0\Field15)
                positionentity(local0\Field31, local0\Field22\Field24, local0\Field22\Field23, local0\Field22\Field4, $00)
                scaleentity(local0\Field31, (local0\Field22\Field26 - local0\Field22\Field16), (local0\Field22\Field19 - local0\Field22\Field29), (local0\Field22\Field31 - local0\Field22\Field10), $00)
                local0\Field12 = createpivot(local0\Field15)
                positionentity(local0\Field12, local0\Field22\Field32, local0\Field22\Field2, local0\Field22\Field17, $00)
                scaleentity(local0\Field12, (local0\Field22\Field28 - local0\Field22\Field27), (local0\Field22\Field9 - local0\Field22\Field30), (local0\Field22\Field25 - local0\Field22\Field18), $00)
                scaleentity(local0\Field15, (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
                entitytype(local0\Field15, $01, $00)
                entitypickmode(local0\Field15, $02, $01)
                positionentity(local0\Field15, arg2, arg3, arg4, $00)
                For local2 = $00 To $1D Step $01
                    local0\Field30[local2] = $00
                Next
                seedrnd(generateseednumber(randomseed))
                fillroom(local0)
                local0\Field21 = (Int arg6)
                rotateentity(local0\Field15, 0.0, arg6, 0.0, $00)
                seedrnd(local3)
                Return local0
            EndIf
        Next
    EndIf
    local4 = $00
    For local1 = Each roomtemplates
        For local2 = $00 To $04 Step $01
            If (local1\Field14[local2] = arg0) Then
                If (local1\Field3 = arg1) Then
                    local4 = (local4 + local1\Field22)
                    Exit
                EndIf
            EndIf
        Next
    Next
    local5 = rand(local4, $01)
    local4 = $00
    For local1 = Each roomtemplates
        For local2 = $00 To $04 Step $01
            If (((local1\Field14[local2] = arg0) And (local1\Field3 = arg1)) <> 0) Then
                local4 = (local4 + local1\Field22)
                If (((local5 > (local4 - local1\Field22)) And (local5 <= local4)) <> 0) Then
                    local0\Field22 = local1
                    local3 = rndseed()
                    If (local1\Field0 = $00) Then
                        loadroommesh(local1)
                    EndIf
                    local0\Field15 = copyentity(local1\Field0, $00)
                    local0\Field31 = createpivot(local0\Field15)
                    positionentity(local0\Field31, local0\Field22\Field24, local0\Field22\Field23, local0\Field22\Field4, $00)
                    scaleentity(local0\Field31, (local0\Field22\Field26 - local0\Field22\Field16), (local0\Field22\Field19 - local0\Field22\Field29), (local0\Field22\Field31 - local0\Field22\Field10), $00)
                    local0\Field12 = createpivot(local0\Field15)
                    positionentity(local0\Field12, local0\Field22\Field32, local0\Field22\Field2, local0\Field22\Field17, $00)
                    scaleentity(local0\Field12, (local0\Field22\Field28 - local0\Field22\Field27), (local0\Field22\Field9 - local0\Field22\Field30), (local0\Field22\Field25 - local0\Field22\Field18), $00)
                    scaleentity(local0\Field15, (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
                    entitytype(local0\Field15, $01, $00)
                    entitypickmode(local0\Field15, $02, $01)
                    positionentity(local0\Field15, arg2, arg3, arg4, $00)
                    For local2 = $00 To $1D Step $01
                        local0\Field30[local2] = $00
                    Next
                    seedrnd(generateseednumber(randomseed))
                    fillroom(local0)
                    local0\Field21 = (Int arg6)
                    rotateentity(local0\Field15, 0.0, arg6, 0.0, $00)
                    seedrnd(local3)
                    Return local0
                EndIf
            EndIf
        Next
    Next
    catcherrors((((((((((("Uncaught: CreateRoom.Rooms(" + (Str arg1)) + ", ") + (Str arg2)) + ", ") + (Str arg3)) + ", ") + (Str arg4)) + ", ") + (Str arg5)) + "))"))
    Return Null
End Function

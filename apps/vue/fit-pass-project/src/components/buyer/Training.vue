<template>
  <div class="training-wrapper">
    <div class="content-img-wrapper">
      <img :src="training.history.trainingSession.pictureUrl" alt="">
    </div>
    <div class="content-data-wrapper">
      <div class="content-data-left">
        <div class="content-data-name">
          <span>Content Name:</span>
          {{ training.history.trainingSession.name }}
        </div>
        <div class="content-data-type">
          <span>Training type:</span>
          {{ training.history.trainingSession.type }}
        </div>

        <div class="content-data-coach">
          <span>Coach Username:</span>
          {{ training.history.coachUsername }}
        </div>
      </div>
      <div class="content-data-right">
        <div class="content-data-application">
          <span>Date of Application:</span>
          {{ training.history.application }}
        </div>
        <div class="content-data-duration">
          <span>Training duration:</span>
          {{ training.history.trainingSession.trainingDuration }}
        </div>
        <div class="content-data-object">
          <span>Object Name:</span>
          {{ training.object.name }}
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  props: {
    training: {}
  },
  mounted: function () {
    console.log("training")
    console.log(this.training)
  },
  name: "Training"
}
</script>

<style scoped>
.training-wrapper {
  display: flex;
  align-items: center;
  max-width: 100%;
  min-height: 300px;
  outline: 1px solid lightgray;
  padding: 1rem;
}

.content-img-wrapper {
  height: 100%;
  max-height: 300px;
  border: 1px solid lightgray;
}

.content-img-wrapper img {
  flex-shrink: 0;
  max-height: 256px;
  max-width: 256px;

}

.content-data-wrapper {
  display: flex;
  min-height: 100%;
  width: 100%;
  align-items: center;
  padding: 1rem;
  gap: 2rem;
}

.content-data-wrapper div {
  display: flex;
  flex-direction: column;
  gap: 1rem;
  font-size: 1rem;
}

.content-data-wrapper span {
  font-weight: 900;
  font-size: 1.5rem;
}
</style>